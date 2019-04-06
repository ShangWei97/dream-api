package com.dreamfield.dreamapi.request;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author: shangwei
 * @date: 2019-04-06 18:55
 */
@Data
public class AddBookReqBean {

	private Integer userId;

	private String bookSBNNum;

	private String bookName;

	private String bookAuthor;

	private String bookPublisher;

	private String bookImg;

	private BigDecimal bookPrice;

	private BigDecimal bookPriceNow;

	private Integer bookNum;

	private String bookNewType;

	private String bookType;





}
