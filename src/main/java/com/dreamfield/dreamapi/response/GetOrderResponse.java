package com.dreamfield.dreamapi.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author: shangwei
 * @date: 2019-04-12 23:06
 */
@Data
public class GetOrderResponse {

	private Integer id;

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createTime;

	private String status;

	private Integer sellerId;

	private Integer buyerId;

	private Integer bookId;

	private java.math.BigDecimal price;

	private Integer statusId;

	private String bookName;

	private String bookPublisher;

	private String bookImgUrl;

	private String bookAuthor;

}
