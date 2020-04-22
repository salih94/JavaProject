package com.salih.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class IsimAspect {
	
	@Pointcut("execution(* *ame(..))")
	public void simPC() {
		
	}
	
	@Before("simPC()")
	public void logMesaj2() {
		System.out.println("simle biter çalýþtý");
	}
	
}
