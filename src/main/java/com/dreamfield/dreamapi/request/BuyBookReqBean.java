package com.dreamfield.dreamapi.request;

import lombok.Data;

/**
 * @author: shangwei
 * @date: 2019-04-11 17:04
 */
@Data
public class BuyBookReqBean {

	private Integer bookId;

	private Integer userId;

	private Integer ownerId;

}
