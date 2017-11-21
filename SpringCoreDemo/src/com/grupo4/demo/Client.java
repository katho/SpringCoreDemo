package com.grupo4.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// Object construction
		Employee eRef = new Employee();
		eRef.setEid(101);
		eRef.setEname("Sponge Bob Square Pants");
		eRef.setEaddress("Bikini Bottom");
		System.out.println("Employee details: "+eRef);
		
		//Spring Way | IoC Inversion of Control
		//Resource resource = new ClassPathResource("employeebean.xml");
		//BeanFactory factory = new XmlBeanFactory(resource); //Spring container which parse XML file to construct objects
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
		/*Employee e1 = (Employee) factory.getBean("emp1");
		Employee e2 = (Employee) factory.getBean("emp2");
		Employee e3 = factory.getBean("emp3", Employee.class);
		
		System.out.println("Employee1 details: "+e1);
		System.out.println("Employee2 details: "+e2);
		System.out.println("Employee3 details: "+e3);*/
	}

}
