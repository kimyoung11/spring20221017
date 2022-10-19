package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Controller02 {
	
	@RequestMapping("/sub01")
	private void method1() {
		System.out.println("ex02 메소드1");
	}
	
	@RequestMapping("/sub02")
	private void method2() {
		System.out.println("ex02 메소드2");
	}
	
	@RequestMapping("/sub03")
	private void method3() {
		System.out.println("ex02 메소드3");
	}
	
}
