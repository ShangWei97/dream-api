package com.dreamfield.dreamapi.controller;

import com.dreamfield.dreamapi.constant.ReturnMsg;
import com.dreamfield.dreamapi.enums.ReturnEnum;
import com.dreamfield.dreamapi.mapper.dream.BookMapper;
import com.dreamfield.dreamapi.mapper.dream.UserInfoMapper;
import com.dreamfield.dreamapi.mapper.dream.UserMapper;
import com.dreamfield.dreamapi.model.dream.Book;
import com.dreamfield.dreamapi.model.dream.User;
import com.dreamfield.dreamapi.model.dream.UserInfo;
import com.dreamfield.dreamapi.request.*;
import com.dreamfield.dreamapi.response.GetUserInfoResponse;
import com.dreamfield.dreamapi.utils.HttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: shangwei
 * @date: 2019-03-29 09:55
 */
@Slf4j
@RestController
@RequestMapping("dream")
public class UserController {
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Autowired
	private BookMapper bookMapper;

	private final String host = "http://dingxin.market.alicloudapi.com";

	private final String path = "/dx/sendSms";

	private final String method = "POST";

	private final String appcode = "dbb50391be304f44890578654f04e99e";

	private final String tpl_id_doraemon ="TP19040255";

	private final String tpl_id_gat="TP1809092";

	@PostMapping("login")
	public ReturnMsg login(@RequestBody LoginReqBean reqBean, HttpServletResponse response, HttpServletRequest request){
		log.debug("login param:",reqBean);
		ReturnMsg returnMsg = new ReturnMsg();
		if ( null == reqBean.getUserTel()){
			returnMsg.setCode(ReturnEnum.NOT_NULL.getCode());
			returnMsg.setMsg(ReturnEnum.NOT_NULL.getMessage());
			returnMsg.setStatus(false);
			return returnMsg;
		}
		User user = new User();
		// 密码登录
		if ( null != reqBean.getPassword()){
			if (null != reqBean.getPassword()){
				user.setUserTel(reqBean.getUserTel());
			}else {
				returnMsg.setStatus(false);
				returnMsg.setMsg("密码为空");
				return returnMsg;
			}
			User user1 = userMapper.queryUserLimit1(user);
			if (null != user1){
				if ( reqBean.getPassword().equals(user1.getPassword())) {
					returnMsg.setMsg("登录成功");
					returnMsg.setData(user1.getId());
					Cookie cookie = new Cookie("userId", user1.getId().toString());
					cookie.setPath("/");
					cookie.setMaxAge(80000);
					response.addCookie(cookie);
					return returnMsg;
				}else {
					returnMsg.setMsg("登录失败,密码错误");
					returnMsg.setStatus(false);
					return returnMsg;
				}
			}else {
				returnMsg.setMsg("尊敬的用户,您还未注册,请先注册哦");
				returnMsg.setStatus(false);
				return returnMsg;
			}
		}else {
			// 验证码登录
			if (null != reqBean.getLoginCode()) {
				user.setUserTel(reqBean.getUserTel());
				user.setLoginCode(reqBean.getLoginCode());
				User user1 = userMapper.queryUserLimit1(user);
                if (user1 != null) {
	                returnMsg.setMsg("登录成功");
	                returnMsg.setData(user1.getId());
	                Cookie cookie = new Cookie("userId", user1.getId().toString());
	                cookie.setPath("/");
	                cookie.setMaxAge(80000);
	                response.addCookie(cookie);
	                return returnMsg;
                }else {
	                returnMsg.setMsg("登录失败,验证码错误");
	                returnMsg.setStatus(false);
	                return returnMsg;
                }
			}else {
				returnMsg.setStatus(false);
				returnMsg.setMsg("验证码为空");
				return returnMsg;
			}
		}
	}

	private ReturnMsg sendMsgCode(String userTel,String tpl_id){
		ReturnMsg returnMsg = new ReturnMsg();
		Map<String, String> headers = new HashMap<>();
		int code = (int) (Math.random()*(10000-1000+1)+1000);
		//最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
		headers.put("Authorization", "APPCODE " + appcode);
		Map<String, String> querys = new HashMap<String, String>();
		querys.put("mobile", userTel);
		querys.put("param", "code:"+code+"");
		querys.put("tpl_id", tpl_id);
		Map<String, String> bodys = new HashMap<>();
		try {
			HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
			log.info(response.toString());
			returnMsg.setData(code);
			return returnMsg;
		} catch (Exception e) {
			e.printStackTrace();
			returnMsg.setStatus(false);
			return returnMsg;
		}
	}

	@PostMapping("login/getCode")
	public ReturnMsg getCode(@RequestBody GetCodeReqBean reqBean){
		log.debug("getCode param",reqBean);
		ReturnMsg returnMsg = new ReturnMsg();
		User user = new User();
		if (null == reqBean.getTelNum()){
			returnMsg.setStatus(false);
			returnMsg.setMsg("手机号不能为空");
			return returnMsg;
		}
		user.setUserTel(reqBean.getTelNum());
		if (reqBean.getStatus() == 0) {
			List<User> userList = userMapper.queryUser(user);
			if (null != userList && userList.size() > 0) {
				user.setUserTel(reqBean.getTelNum());
				ReturnMsg msg;
				if (reqBean.getTplId() == 1) {
				     msg = sendMsgCode(reqBean.getTelNum(),tpl_id_doraemon);
				}else {
					 msg = sendMsgCode(reqBean.getTelNum(),tpl_id_gat);
				}
				if (msg.getStatus()) {
					user.setLoginCode(msg.getData().toString());
					userMapper.updateByUserTel(user.getUserTel(),user.getLoginCode());
					returnMsg.setData(msg.getData().toString());
					return returnMsg;
				} else {
					returnMsg.setStatus(false);
					returnMsg.setMsg("系统出现问题，稍后再试试");
					return returnMsg;
				}
			} else {
				returnMsg.setStatus(false);
				returnMsg.setMsg("尊敬的用户,你还未注册，请先注册哦");
				return returnMsg;
			}
		}else if (reqBean.getStatus() == 1){
			User user_param = new User();
			user_param.setUserTel(reqBean.getTelNum());
			User user_result = userMapper.queryUserLimit1(user);
			if ( user_result == null) {
				ReturnMsg msg;
				if (reqBean.getTplId() == 1){
					msg = sendMsgCode(reqBean.getTelNum(),tpl_id_doraemon);
				}else {
					msg = sendMsgCode(reqBean.getTelNum(),tpl_id_gat);
				}
				User user1 = new User();
				user1.setLoginCode(msg.getData().toString());
				user1.setUserTel(reqBean.getTelNum());
				userMapper.insertUser(user1);
				returnMsg.setData(msg.getData());
				returnMsg.setMsg(msg.getMsg());
				returnMsg.setStatus(msg.getStatus());
				return returnMsg;
			}else {
				returnMsg.setStatus(false);
				returnMsg.setMsg("尊敬的用户你已经注册过哦，请勿重复注册");
				return returnMsg;
			}
		}else {
			returnMsg.setStatus(false);
			returnMsg.setMsg("系统错误");
			return returnMsg;
		}
	}

	@PostMapping("register")
	public ReturnMsg register(@RequestBody RegisterReqBean reqBean){
		log.debug("register request:",reqBean);
		ReturnMsg returnMsg = new ReturnMsg();
		User user_param = new User();
		user_param.setUserTel(reqBean.getUserTel());
		user_param.setLoginCode(reqBean.getLoginCode());
		User user_reslt = userMapper.queryUserLimit1(user_param);
		if (user_reslt != null) {
			User user = new User();
			user.setUserName(reqBean.getUserName());
			user.setUserTel(reqBean.getUserTel());
			user.setSex(reqBean.getGender());
			user.setPassword(reqBean.getPassword());
			user.setId(user_reslt.getId());
			userMapper.updateUser(user);
			returnMsg.setMsg("注册成功");
			returnMsg.setData(user_reslt.getId());
			return returnMsg;
		}else {
			returnMsg.setMsg("验证码填写错误");
			returnMsg.setStatus(false);
			return returnMsg;
		}
	}

	@PostMapping("updateUser")
	public ReturnMsg updateUser(@RequestBody UpdateUserReqBean reqBean){
		log.info("updateUser param",reqBean);
		ReturnMsg returnMsg = new ReturnMsg();
		User user = new User();
		UserInfo userInfo = new UserInfo();
		user.setId(reqBean.getUserId());
		user.setUserName(reqBean.getUserName());
		user.setSex(reqBean.getUserGender());
		user.setUserTel(reqBean.getTelNumber());
		userInfo.setUserId(reqBean.getUserId());
		userInfo.setImgUrl(reqBean.getUserImgUrl());
		userInfo.setUserSignature(reqBean.getUserSignature());
		userMapper.updateUser(user);
		UserInfo userInfo_param = new UserInfo();
		userInfo_param.setUserId(reqBean.getUserId());
		UserInfo userInfo_result = userInfoMapper.queryUserInfoLimit1(userInfo_param);
		if ( userInfo_result != null) {
			userInfo.setId(userInfo_result.getId());
			userInfoMapper.updateUserInfo(userInfo);
		}else {
			userInfoMapper.insertUserInfo(userInfo);
		}
		return returnMsg;
	}

	@PostMapping("getUserInfo")
	public ReturnMsg getUserInfo(@RequestBody GetUserInfoReqBean reqBean){
		ReturnMsg returnMsg = new ReturnMsg();
		GetUserInfoResponse response = new GetUserInfoResponse();
		if ( null == reqBean.getUserId()) {
			returnMsg.setStatus(false);
			returnMsg.setMsg("必填参数不能为空");
		}
		User user_param = new User();
		user_param.setId(reqBean.getUserId());
		UserInfo userInfo_param = new UserInfo();
		userInfo_param.setUserId(reqBean.getUserId());
		User user = userMapper.queryUserLimit1(user_param);
		UserInfo userInfo = userInfoMapper.queryUserInfoLimit1(userInfo_param);
		Book book = new Book();
		book.setUserId(reqBean.getUserId());
		book.setValid(1);
		List<Book> bookList = bookMapper.queryBook(book);
		response.setUserName(user.getUserName());
		if (null != userInfo && null != userInfo.getImgUrl()) {
			response.setUserImgUrl(userInfo.getImgUrl());
			if ( null != userInfo.getMoney()){
				response.setMoney(userInfo.getMoney());
			}
		}
		response.setTelNumber(user.getUserTel());
		response.setUserGender(user.getSex());
		if ( null != userInfo && null != userInfo.getUserSignature()) {
			response.setUserSignature(userInfo.getUserSignature());
		}
		response.setSellBookList(bookList);
		returnMsg.setData(response);
		return returnMsg;
	}

}
