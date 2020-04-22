package com.salih.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.salih.aopdemo.dao.StudentDAO;
import com.salih.aopdemo.domain.Student;

public class AOPDemoApp {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AOPDemoConfig.class);
		
		System.out.println("Context Started");
		
	//	StudentDAO stDAO=ctx.getBean("studentDAO",StudentDAO.class);
		
		Student stu=ctx.getBean("student",Student.class);
		
		System.out.println(stu.getFirstName());
		
		ctx.close();
		System.out.println("Context Closed");

	}

}
