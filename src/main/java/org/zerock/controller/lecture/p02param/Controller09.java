package org.zerock.controller.lecture.p02param;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex09")
public class Controller09 {
	//request 받는법

	@GetMapping("sub01")
	private void method1(@RequestParam(name = "address") String a) {
		System.out.println(a);
	}
	
	@GetMapping("sub02")
	private void method2(@RequestParam(name = "age") int a) {
		System.out.println(a);
	}
	
	@GetMapping("sub03")
	private void method3(@RequestParam(value = "age") int a) {
		System.out.println(a);
	}
	
	@GetMapping("sub04")
	private void method4(@RequestParam("age") int a) {
		System.out.println(a);
	}
	
	@GetMapping("sub05")
	private void method5(@RequestParam("num1") int a, @RequestParam("num2") int b) {
		System.out.println(a + b);
	}
	
	//city = seoul 
	@GetMapping("sub06")
	private void method6(@RequestParam(name = "address", required = false) String city) {
		System.out.println(city);
	}
	
	@GetMapping("sub07")
	private void method7(@RequestParam(name = "address" , defaultValue = "seoul") String city) {
		System.out.println(city);
	}
	
	@GetMapping("sub08")
	private void method8(String city) {
		System.out.println(city);
	}
	
	@GetMapping("sub09")
	private void method9(@RequestParam("city") String city,int age,String name) {
		System.out.println(city + " " + age + " " + name);
	}
	
	@RequestMapping("sub10")
	private void method10(String name, String address, int age, String email, String password) {
		System.out.println(name + " " +address + " " + age + " " + email + " " + password);
	}
}
