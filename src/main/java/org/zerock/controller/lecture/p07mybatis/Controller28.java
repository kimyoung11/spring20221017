package org.zerock.controller.lecture.p07mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.mapper.lecture.Mapper01;

@Controller
@RequestMapping("ex28")
public class Controller28 {
	
	@Autowired
	private Mapper01 mapper;
	
	@RequestMapping("sub01")
	private void method1() {
		String time =mapper.getCurrentTime();
		System.out.println(time);
	}
	
	@RequestMapping("sub02")
	private void method2() {
		System.out.println(mapper.getCustomerName());
	}
	
	@RequestMapping("sub03")
	private void method3() {
		System.out.println(mapper.getEmployeeName());
	}
	
	@RequestMapping("sub04")
	private void method4() {
		System.out.println(mapper.getProductName());
	}
	
	@RequestMapping("sub05")
	private void method5() {
		System.out.println(mapper.getPrice());
	}
	
	@RequestMapping("sub06")
	private void method6() {
		System.out.println(mapper.getQuantity());
	}
	
	@RequestMapping("sub07")
	private void method07() {
		System.out.println(mapper.getBirthDate());
	}
}
