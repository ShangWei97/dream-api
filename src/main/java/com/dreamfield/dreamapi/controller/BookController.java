package com.dreamfield.dreamapi.controller;

import com.dreamfield.dreamapi.constant.ReturnMsg;
import com.dreamfield.dreamapi.enums.OrderStatusEnum;
import com.dreamfield.dreamapi.mapper.dream.*;
import com.dreamfield.dreamapi.model.dream.*;
import com.dreamfield.dreamapi.request.AddBookReqBean;
import com.dreamfield.dreamapi.request.BuyBookReqBean;
import com.dreamfield.dreamapi.request.DeleteBookReqBean;
import com.dreamfield.dreamapi.request.UpdateBookReqBean;
import com.dreamfield.dreamapi.response.GetAllBookResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: shangwei
 * @date: 2019-04-06 17:38
 */
@RestController
@RequestMapping("book")
public class BookController {

	@Autowired
	private BookMapper bookMapper;

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Autowired
	private MsgMapper msgMapper;

	@Autowired
	private OrderMapper orderMapper;


	@PostMapping("addBook")
	public ReturnMsg addBook(@RequestBody AddBookReqBean reqBean){
		ReturnMsg returnMsg = new ReturnMsg();
		Book book = new Book();
		book.setBookTime(LocalDateTime.now());
		book.setBookName(reqBean.getBookName());
		book.setUserId(reqBean.getUserId());
		book.setBookAuthor(reqBean.getBookAuthor());
		book.setBookNum(reqBean.getBookNum());
		book.setBookSBNNum(reqBean.getBookSBNNum());
		book.setBookPublisher(reqBean.getBookPublisher());
		book.setBookImgUrl(reqBean.getBookImg());
		book.setBookPrice(reqBean.getBookPrice());
		book.setBookPriceNow(reqBean.getBookPriceNow());
		book.setBookNewType(reqBean.getBookNewType());
		book.setBookType(reqBean.getBookType());
		bookMapper.insertBook(book);
		return returnMsg;
	}

	@GetMapping("getAllBook")
	public ReturnMsg getAllBook(){
		ReturnMsg returnMsg = new ReturnMsg();
		List<GetAllBookResponse> responseList = new ArrayList<>();
		Book book_param = new Book();
		book_param.setValid(1);
		List<Book> bookList =bookMapper.queryBook(book_param);
		for (Book book:bookList){
			GetAllBookResponse response = new GetAllBookResponse();
			User user_param = new User();
			UserInfo userInfo_param = new UserInfo();
			Msg msg_param = new Msg();
			user_param.setId(book.getUserId());
			userInfo_param.setUserId(book.getUserId());
			msg_param.setBookId(book.getId());
			User user = userMapper.queryUserLimit1(user_param);
			UserInfo userInfo = userInfoMapper.queryUserInfoLimit1(userInfo_param);
			List<Msg> msgList = msgMapper.queryMsg(msg_param);
			BeanUtils.copyProperties(book,response);
			response.setUserGender(user.getSex());
			response.setUserImgUrl(userInfo.getImgUrl());
			response.setUserName(user.getUserName());
			if ( msgList != null && msgList.size() >0){
				response.setMsgSize(msgList.size());
			}else {
				response.setMsgSize(0);
			}
			responseList.add(response);
		}
		returnMsg.setData(responseList);
		return returnMsg;
	}

	@PostMapping("updateBook")
	public ReturnMsg updateBook(@RequestBody UpdateBookReqBean reqBean){
		ReturnMsg returnMsg = new ReturnMsg();
		Book book = new Book();
		book.setId(reqBean.getBookId());
		Book book_result = bookMapper.queryBookLimit1(book);
		if (book_result!= null && book_result.getUserId().equals(reqBean.getUserId())){
			book.setBookNum(reqBean.getBookNum());
			book.setBookPriceNow(reqBean.getBookPriceNow());
			bookMapper.updateBook(book);
			return returnMsg;
		}else {
			returnMsg.setStatus(false);
			return returnMsg;
		}
	}

	@PostMapping("deleteBook")
	public ReturnMsg deleteBook(@RequestBody DeleteBookReqBean reqBean){
		ReturnMsg returnMsg = new ReturnMsg();
		Book book = new Book();
		book.setId(reqBean.getBookId());
		Book book_result = bookMapper.queryBookLimit1(book);
		if (book_result != null && reqBean.getUserId().equals(book_result.getUserId())){
			book.setValid(0);
			bookMapper.updateBook(book);
			return returnMsg;
		}else {
			returnMsg.setStatus(false);
			return returnMsg;
		}
	}

	@PostMapping("buyBook")
	public ReturnMsg bugBook(@RequestBody BuyBookReqBean reqBean){
		ReturnMsg returnMsg = new ReturnMsg();
		Book book_param = new Book();
		book_param.setId(reqBean.getBookId());
		Book book = bookMapper.queryBookLimit1(book_param);
		if (book.getBookNum() < 1){
			returnMsg.setStatus(false);
			returnMsg.setMsg("库存不足，请待库存足够时下单");
			return returnMsg;
		}
		UserInfo userInfo_param = new UserInfo();
		userInfo_param.setUserId(reqBean.getUserId());
		UserInfo userInfo = userInfoMapper.queryUserInfoLimit1(userInfo_param);
		BigDecimal money = userInfo.getMoney().subtract(book.getBookPriceNow());
		BigDecimal val = new BigDecimal(0);
		if (money.compareTo(val) < 0){
			returnMsg.setStatus(false);
			returnMsg.setMsg("余额不足，请充值");
			return returnMsg;
		}
		userInfo_param.setMoney(money);
		userInfoMapper.updateUserInfo(userInfo_param);
		Order order = new Order();
		order.setSellerId(reqBean.getOwnerId());
		order.setBookId(reqBean.getBookId());
		order.setBuyerId(reqBean.getUserId());
		order.setCreateTime(LocalDateTime.now());
		order.setPrice(book.getBookPriceNow());
		order.setStatusId(1);
		order.setStatus(OrderStatusEnum.getDescription(1));
		orderMapper.insertOrder(order);
		book_param.setBookNum(book.getBookNum() - 1);
		if (book_param.getBookNum() == 0){
			book_param.setValid(0);
		}
		bookMapper.updateBook(book_param);
		return returnMsg;
	}


}
