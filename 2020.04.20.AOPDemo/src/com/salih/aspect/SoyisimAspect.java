package com.salih.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class SoyisimAspect {
	
	
	
	@Before("com.salih.aspect.IsimAspect.simPC()")
	public void logMesaj2() {
		System.out.println("IsimAspect.simPC() ile soyisim biter çalýþtý");
	}
	
}
