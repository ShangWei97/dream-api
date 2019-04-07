package com.dreamfield.dreamapi.request;

import lombok.Data;

/**
 * @author: shangwei
 * @date: 2019-04-07 11:29
 */
@Data
public class AddMsgReqBean {

	private Integer userId;

	private Integer bookId;

	private Integer parentId;

	private String content;

}
