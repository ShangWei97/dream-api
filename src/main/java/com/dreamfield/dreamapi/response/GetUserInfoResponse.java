package com.dreamfield.dreamapi.response;

import com.dreamfield.dreamapi.model.dream.Book;
import lombok.Data;

import java.util.List;

/**
 * @author: shangwei
 * @date: 2019-03-31 21:04
 */
@Data
public class GetUserInfoResponse {

	private String telNumber;

	private String userImgUrl;

	private String userName;

	private String userGender;

	private String userSignature;

	private List<Book> sellBookList;

}
