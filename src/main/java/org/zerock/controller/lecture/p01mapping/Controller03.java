package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex03")
public class Controller03 {
	
	@RequestMapping({"sub01","sub02","sub03"})
	private void method1() {
		System.out.println("메소드1 호출");
	}
	
	@RequestMapping({"sub04","sub05"})
	private void method2() {
		System.out.println("메소드2 호출");
	}
	
	@RequestMapping(path = "sub06")
	private void method3() {
		System.out.println("메소드3 호출");
	}
}
