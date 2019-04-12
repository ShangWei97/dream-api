package com.dreamfield.dreamapi.request;

import lombok.Data;

/**
 * @author: shangwei
 * @date: 2019-04-12 15:53
 */
@Data
public class GetOrderReqBean {

	private Integer sellerId;

	private Integer buyerId;

	private Integer statusId;

}
