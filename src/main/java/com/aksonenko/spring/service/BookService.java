package com.aksonenko.spring.service;

import java.util.List;

import com.aksonenko.spring.entity.Book;

public interface BookService {

	List<Book> getAllBooks();

	void saveBook(Book book);

	Book getBook(int id);

	void deleteBook(int id);

}
