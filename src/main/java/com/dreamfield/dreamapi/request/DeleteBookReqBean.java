package com.dreamfield.dreamapi.request;

import lombok.Data;

/**
 * @author: shangwei
 * @date: 2019-04-11 20:46
 */
@Data
public class DeleteBookReqBean {

	private Integer userId;

	private Integer bookId;
}
