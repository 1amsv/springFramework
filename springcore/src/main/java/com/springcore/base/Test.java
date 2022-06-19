package com.springcore.base;
import com.springcore.collections.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/base/baseConfig.xml");
        Student student1 = (Student)context.getBean("student1");
        Student student2 = (Student)context.getBean("student2");
        System.out.println(student1);
        System.out.println(student2);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");
        Emp emp1 = (Emp)ctx.getBean("emp1");
        System.out.println(emp1);

    }
}
