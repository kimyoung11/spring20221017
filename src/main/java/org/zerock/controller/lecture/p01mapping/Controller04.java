package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex04")
public class Controller04 {
	
	@RequestMapping("sub01")
	private void method1() {
		System.out.println("메소드 1번 호출");
	}
	
	@RequestMapping(value = "sub02", method = RequestMethod.GET)
	private void method2() {
		System.out.println("메소드 2번 호출");
	}
	
	@RequestMapping(value = "sub03", method = RequestMethod.POST)
	private void method3() {
		System.out.println("메소드 3번 호출");
	}
	
	@RequestMapping(value = "sub04", method = 
			{RequestMethod.GET, RequestMethod.POST})
	private void method4() {
		System.out.println("메소드 4번 호출");
	}
}
