package com.dreamfield.dreamapi.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * @author: shangwei
 * @date: 2019-04-07 13:48
 */
@Data
public class GetAllBookResponse {
	/**
	 * 主键
	 *
	 * isNullAble:0
	 */
	private Integer id;

	/**
	 *
	 * isNullAble:0
	 */
	private Integer userId;

	/**
	 *
	 * isNullAble:1
	 */
	private String bookImgUrl;

	/**
	 *
	 * isNullAble:1
	 */
	private String bookName;

	/**
	 *
	 * isNullAble:1
	 */
	private String bookAuthor;

	/**
	 *
	 * isNullAble:1
	 */
	private java.math.BigDecimal bookPrice;

	/**
	 *
	 * isNullAble:1
	 */
	private java.math.BigDecimal bookPriceNow;

	/**
	 *
	 * isNullAble:1
	 */
	private String bookNewType;

	/**
	 *
	 * isNullAble:1
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private java.time.LocalDateTime bookTime;

	/**
	 *
	 * isNullAble:1
	 */
	private String bookType;

	/**
	 *
	 * isNullAble:1
	 */
	private String bookSBNNum;

	/**
	 *
	 * isNullAble:1
	 */
	private Integer newUserId;

	/**
	 * 默认为1，默认为没有卖出去
	 * isNullAble:0,defaultVal:1
	 */
	private Integer valid;

	/**
	 *
	 * isNullAble:0
	 */
	private Integer bookNum;

	/**
	 *
	 * isNullAble:1
	 */
	private String bookPublisher;

	private String userName;

	private String userImgUrl;

	private String userGender;

	private Integer msgSize;

}
