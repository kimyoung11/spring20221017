package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller01 {
	// @controller annotation : 스프링이 이클래스를 빈으로 만듬
	
	
	@RequestMapping("/ex01/sub01")
	public void method1() {
		System.out.println("메소드 1번 호출");
	}
	
	@RequestMapping("/ex01/sub02")
	private void method2() {
		System.out.println("메소드 2번 호출");
	}
	
	@RequestMapping("/ex01/sub03")
	private void method3() {
		System.out.println("메소드 3번 호출");
	}
}
