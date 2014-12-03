package com.truonghan.AOP;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.truonghan.AOP.services.ShapeServices;

public class AopMain {

	public static void main(String[] args) {
		
		ApplicationContext ct = new ClassPathXmlApplicationContext("spring-config.xml");

		ShapeServices shapeService = ct.getBean("shapeService",ShapeServices.class);
		System.out.println(shapeService.getCircle().getName());
	}

}
