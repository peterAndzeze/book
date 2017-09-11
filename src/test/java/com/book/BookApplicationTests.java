package com.book;

import com.book.dao.BookDao;
import com.book.model.BookModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookApplicationTests {
	@Autowired
	private BookDao bookDao;
	@Test
	public void getBook() {
		BookModel bookModel=bookDao.getBookById(2l);
		Optional optional=Optional.ofNullable(bookModel);
		if(optional.isPresent()) {
			System.out.println(bookModel.getBookName()+"*******************");
		}else {
			System.out.println("bu cunzai ");
		}
	}

}
