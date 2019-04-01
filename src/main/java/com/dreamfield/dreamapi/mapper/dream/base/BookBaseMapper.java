package com.dreamfield.dreamapi.mapper.dream.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.dreamfield.dreamapi.model.dream.Book;
/**
*  @author shangwei
*/
public interface BookBaseMapper {

    int insertBook(Book object);

    int updateBook(Book object);

    int update(Book.UpdateBuilder object);

    List<Book> queryBook(Book object);

    Book queryBookLimit1(Book object);

}