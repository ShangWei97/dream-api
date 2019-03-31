package com.dreamfield.dreamapi.request;

import lombok.Data;

/**
 * @author: shangwei
 * @date: 2019-03-29 09:57
 */
@Data
public class LoginReqBean {

	private String userTel;

	private String password;

	private String loginCode;

}
