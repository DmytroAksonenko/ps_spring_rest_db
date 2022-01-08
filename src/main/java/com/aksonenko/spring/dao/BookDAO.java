package com.aksonenko.spring.dao;

import java.util.List;

import com.aksonenko.spring.entity.Book;

public interface BookDAO {

	List<Book> getAllBooks();

	void saveBook(Book book);

	Book getBook(int id);

	void deleteBook(int id);

}
