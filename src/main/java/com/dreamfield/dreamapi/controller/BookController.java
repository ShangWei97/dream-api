package com.dreamfield.dreamapi.controller;

import com.dreamfield.dreamapi.constant.ReturnMsg;
import com.dreamfield.dreamapi.mapper.dream.BookMapper;
import com.dreamfield.dreamapi.model.dream.Book;
import com.dreamfield.dreamapi.request.AddBookReqBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author: shangwei
 * @date: 2019-04-06 17:38
 */
@RestController
@RequestMapping("book")
public class BookController {

	@Autowired
	private BookMapper bookMapper;


	@PostMapping("addBook")
	public ReturnMsg addBook(@RequestBody AddBookReqBean reqBean){
		ReturnMsg returnMsg = new ReturnMsg();
		Book book = new Book();
		book.setBookTime(LocalDateTime.now());
		book.setBookName(reqBean.getBookName());
		book.setUserId(reqBean.getUserId());
		book.setBookAuthor(reqBean.getBookAuthor());
		book.setBookNum(reqBean.getBookNum());
		book.setBookSBNNum(reqBean.getBookSBNNum());
		book.setBookPublisher(reqBean.getBookPublisher());
		book.setBookImgUrl(reqBean.getBookImg());
		book.setBookPrice(reqBean.getBookPrice());
		book.setBookPriceNow(reqBean.getBookPriceNow());
		book.setBookNewType(reqBean.getBookNewType());
		book.setBookType(reqBean.getBookType());
		bookMapper.insertBook(book);
		return returnMsg;
	}





}
