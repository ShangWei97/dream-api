package com.dreamfield.dreamapi.request;

import lombok.Data;

/**
 * @author: shangwei
 * @date: 2019-03-31 14:34
 */
@Data
public class RegisterReqBean {

	private String userTel;

	private String userName;

	private String sex;

	private String loginCode;

	private String password;

}
