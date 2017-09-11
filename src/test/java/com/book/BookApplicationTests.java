package com.book;

import com.book.dao.BookDao;
import com.book.model.BookModel;
import com.book.topic.dao.TopicDao;
import com.book.user.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages = {"com.book.dao","com.book.*.dao"})
public class BookApplicationTests {
	@Autowired
	private BookDao bookDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private TopicDao topicDao;
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
	@Test
	public void deleteUser() {
		Long count=userDao.delete(1L);
		Assert.assertNotNull(count);
		System.out.println(count);
	}

	/**
	 * 删除不了 是因为mybatis的xml配置中mapper 中定义dao不同
	 * 此
	 */
	@Test
	public void topicDaoDeleteUser() {
		Long count=topicDao.delete(1L);
		Assert.assertNotNull(count);
		System.out.println(count);
	}

	@Test
	public void topicDaoDelete() {
		Long count=topicDao.delete(1L);
		Assert.assertNotNull(count);
		System.out.println(count);
	}

}
