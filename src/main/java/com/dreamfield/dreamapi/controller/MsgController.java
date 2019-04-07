package com.dreamfield.dreamapi.controller;

import com.dreamfield.dreamapi.constant.ReturnMsg;
import com.dreamfield.dreamapi.mapper.dream.MsgMapper;
import com.dreamfield.dreamapi.mapper.dream.UserInfoMapper;
import com.dreamfield.dreamapi.mapper.dream.UserMapper;
import com.dreamfield.dreamapi.model.dream.Msg;
import com.dreamfield.dreamapi.model.dream.User;
import com.dreamfield.dreamapi.model.dream.UserInfo;
import com.dreamfield.dreamapi.request.AddMsgReqBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: shangwei
 * @date: 2019-04-07 11:28
 */
@RestController
@RequestMapping("msg")
public class MsgController {
	@Autowired
	private UserInfoMapper userInfoMapper;

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private MsgMapper msgMapper;

	@PostMapping("addMsg")
	public ReturnMsg addMsg(@RequestBody AddMsgReqBean reqBean){
		ReturnMsg returnMsg = new ReturnMsg();
		User user = new User();
		UserInfo userInfo = new UserInfo();
		Msg msg = new Msg();
		user.setId(reqBean.getUserId());
		userInfo.setUserId(reqBean.getUserId());
		UserInfo userInfo_result = userInfoMapper.queryUserInfoLimit1(userInfo);
		User user_result = userMapper.queryUserLimit1(user);
		msg.setMsgUserId(reqBean.getUserId());
		msg.setBookId(reqBean.getBookId());
		msg.setMsgUserGender(user_result.getSex());
		msg.setMsgContent(reqBean.getContent());
		msg.setMsgUserImgUrl(userInfo_result.getImgUrl());
		msg.setMsgUserName(user_result.getUserName());
		if ( reqBean.getParentId() != null) {
			msg.setParentId(reqBean.getParentId());
		}
		msgMapper.insertMsg(msg);
		returnMsg.setData(msg.getId());
		return returnMsg;
	}


}
