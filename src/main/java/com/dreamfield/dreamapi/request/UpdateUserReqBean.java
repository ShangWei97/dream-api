package com.dreamfield.dreamapi.request;

import lombok.Data;

/**
 * @author: shangwei
 * @date: 2019-03-31 22:01
 */
@Data
public class UpdateUserReqBean {
	private Integer userId;

	private String telNumber;

	private String userImgUrl;

	private String userName;

	private String userGender;

	private String userSignature;

}
