package com.dreamfield.dreamapi.controller;

import com.dreamfield.dreamapi.constant.ReturnMsg;
import com.dreamfield.dreamapi.mapper.dream.BookMapper;
import com.dreamfield.dreamapi.mapper.dream.UserInfoMapper;
import com.dreamfield.dreamapi.mapper.dream.UserMapper;
import com.dreamfield.dreamapi.model.dream.Book;
import com.dreamfield.dreamapi.model.dream.User;
import com.dreamfield.dreamapi.model.dream.UserInfo;
import com.dreamfield.dreamapi.request.AddBookReqBean;
import com.dreamfield.dreamapi.response.GetAllBookResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
			user_param.setId(book.getUserId());
			userInfo_param.setUserId(book.getUserId());
			User user = userMapper.queryUserLimit1(user_param);
			UserInfo userInfo = userInfoMapper.queryUserInfoLimit1(userInfo_param);
			BeanUtils.copyProperties(book,response);
			response.setUserGender(user.getSex());
			response.setUserImgUrl(userInfo.getImgUrl());
			response.setUserName(user.getUserName());
			responseList.add(response);
		}
		returnMsg.setData(responseList);
		return returnMsg;
	}





}
