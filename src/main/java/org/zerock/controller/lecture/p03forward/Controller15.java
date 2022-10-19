package org.zerock.controller.lecture.p03forward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex15")
public class Controller15 {

	@RequestMapping("sub01")
	private void method1() {
		System.out.println("메소드 1번 실행");
	}
	
	@RequestMapping("sub02")
	private void method2() {
		System.out.println("메소드 2번 실행");
	}
	
	@RequestMapping("sub03")
	private void method3() {
		System.out.println("메소드 3번요");
		return ;
	}
	
	@RequestMapping("sub04")
	private String method4() {
		System.out.println("메소드 4번요");
		return null;
	}
		
	@RequestMapping("sub05")
	private String method5(String name) {
		if(name == null)
			return null;
		return "ex15/sub051";
	}
	
	@RequestMapping(value = "sub06", params = "address")
	private String method6() {
		return "ex15/sub061";
	}
	
	@RequestMapping("sub06")
	private void method7() {
		return ;
	}
}
