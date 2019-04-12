package com.dreamfield.dreamapi.controller;

import com.dreamfield.dreamapi.constant.ReturnMsg;
import com.dreamfield.dreamapi.mapper.dream.OrderMapper;
import com.dreamfield.dreamapi.model.dream.Order;
import com.dreamfield.dreamapi.request.GetOrderReqBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@PostMapping("getOrder")
	public ReturnMsg getOrder(@RequestBody GetOrderReqBean reqBean){
		ReturnMsg returnMsg = new ReturnMsg();
		Order order = new Order();
		if (reqBean.getBuyerId() != null){
			order.setBuyerId(reqBean.getBuyerId());
		}
		if (reqBean.getSellerId() != null){
			order.setSellerId(reqBean.getSellerId());
		}
		if (reqBean.getStatusId() != null){
			order.setStatusId(reqBean.getStatusId());
		}
		List<Order> orderList = orderMapper.queryOrder(order);
		returnMsg.setData(orderList);
		return returnMsg;
	}

	@PostMapping("updateOrderStatus")
	public ReturnMsg updateOrderStatus(){
		ReturnMsg returnMsg = new ReturnMsg();

		return returnMsg;
	}



}
