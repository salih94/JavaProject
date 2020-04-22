package com.salih.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(5)
public class GetAspect {
	
	@Pointcut("execution(* get*(..))")
	private void getterPC() {
		
	}
	@Before("getterPC()")
	public void logMesaj2() {
		System.out.println("Getle baþlar çalýþtý");
	}
}
