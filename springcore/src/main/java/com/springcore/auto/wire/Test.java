package com.springcore.auto.wire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoConfig.xml");
		 Emp obj1 = ctx.getBean("emp1", Emp.class);//Emp.class is used to replace typeCasting
		 System.out.println(obj1);
	}

}
