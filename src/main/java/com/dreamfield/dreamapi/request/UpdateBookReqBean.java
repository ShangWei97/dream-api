package com.dreamfield.dreamapi.request;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author: shangwei
 * @date: 2019-04-11 16:00
 */
@Data
public class UpdateBookReqBean {

	private Integer bookId;

	private BigDecimal bookPriceNow;

	private Integer bookNum;

}
