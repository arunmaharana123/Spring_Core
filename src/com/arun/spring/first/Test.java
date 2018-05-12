package com.arun.spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		MyData myData = (MyData) factory.getBean("mydata");
		myData.getData();

	}

}



