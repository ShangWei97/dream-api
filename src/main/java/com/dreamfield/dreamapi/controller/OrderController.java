package com.dreamfield.dreamapi.controller;

import com.dreamfield.dreamapi.constant.ReturnMsg;
import com.dreamfield.dreamapi.mapper.dream.BookMapper;
import com.dreamfield.dreamapi.mapper.dream.OrderMapper;
import com.dreamfield.dreamapi.model.dream.Book;
import com.dreamfield.dreamapi.model.dream.Order;
import com.dreamfield.dreamapi.request.GetOrderReqBean;
import com.dreamfield.dreamapi.response.GetOrderResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: shangwei
 * @date: 2019-04-12 15:19
 */
@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private BookMapper bookMapper;

	@PostMapping("getOrder")
	public ReturnMsg getOrder(@RequestBody GetOrderReqBean reqBean){
		ReturnMsg returnMsg = new ReturnMsg();
		Order order_param = new Order();
		if (reqBean.getBuyerId() != null){
			order_param.setBuyerId(reqBean.getBuyerId());
		}
		if (reqBean.getSellerId() != null){
			order_param.setSellerId(reqBean.getSellerId());
		}
		if (reqBean.getStatusId() != null){
			order_param.setStatusId(reqBean.getStatusId());
		}
		List<Order> orderList = orderMapper.queryOrder(order_param);
		List<GetOrderResponse> responseList = new ArrayList<>();
		for (Order order : orderList){
			GetOrderResponse response = new GetOrderResponse();
			BeanUtils.copyProperties(order,response);
			Book book_param = new Book();
			book_param.setId(order.getBookId());
			Book book = bookMapper.queryBookLimit1(book_param);
			response.setBookImgUrl(book.getBookImgUrl());
			response.setBookAuthor(book.getBookAuthor());
			response.setBookPublisher(book.getBookPublisher());
			response.setBookName(book.getBookName());
			responseList.add(response);
		}
		returnMsg.setData(responseList);
		return returnMsg;
	}

	@PostMapping("updateOrderStatus")
	public ReturnMsg updateOrderStatus(){
		ReturnMsg returnMsg = new ReturnMsg();

		return returnMsg;
	}



}
