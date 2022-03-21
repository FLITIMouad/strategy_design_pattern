package com.albert.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	@Test
	public void test(){
		/* 
		  HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		  HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld_2");
		  obj.getMessage();
			obj2.getMessage(); */
			ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");
		 	FacturationService f = (FacturationService) context.getBean("facturationService");
			System.out.println(f.calculeMontantTtc(123)); 
		  
	}
}
