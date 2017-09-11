package com.book;

import com.book.topic.dao.TopicDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = {"com.book.dao","com.book.*.dao"})
public class BookApplication {

	public static void main(String[] args) {

		ApplicationContext app=SpringApplication.run(BookApplication.class, args);
		System.out.println(app.getBean(TopicDao.class));
	}
}
