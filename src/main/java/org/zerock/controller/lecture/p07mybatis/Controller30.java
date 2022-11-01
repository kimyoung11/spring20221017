package org.zerock.controller.lecture.p07mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean04;
import org.zerock.domain.lecture.JavaBean05;
import org.zerock.domain.lecture.JavaBean06;
import org.zerock.mapper.lecture.Mapper03;

@Controller
@RequestMapping("ex30")
public class Controller30 {
	
	@Autowired
	private Mapper03 mapper;
	
	@RequestMapping("sub01")
	private void method1() {
		// TODO Auto-generated method stub
		JavaBean04 customer = mapper.getCustomer();
		System.out.println(customer);
	}
	
	@RequestMapping("sub02")
	private void method2() {
		// TODO Auto-generated method stub
		JavaBean05 employees = mapper.getEmployee();
		System.out.println(employees);
		System.out.println(employees.getFirstName());
		System.out.println(employees.getLastName());
	}
	
	@RequestMapping("sub03")
	private void method3() {
		JavaBean05 employees2 = mapper.getEmployee2();
		System.out.println(employees2.getFirstName());
		System.out.println(employees2.getLastName());
	}
	
	@RequestMapping("sub05")
	private void method5() {
		JavaBean06 prod = mapper.getProduct();
		System.out.println(prod.getName());
		System.out.println(prod.getPrice());
	}
}
