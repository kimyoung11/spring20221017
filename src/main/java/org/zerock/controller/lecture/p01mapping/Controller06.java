package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex06")
public class Controller06 {
	
	
	//requestmapping(value ="sub01", method = get방식)
	//우선순위에있어 get방식만 수행
	@GetMapping("sub01")
	private void method1() {
		System.out.println("method1 실행");
	}
	
	@GetMapping("sub02")
	private void method2() {
		System.out.println("method2 실행");
	}
	
	@GetMapping(value = "sub02", params = "address")
	private void method3() {
		System.out.println("method4 실행");
	}
	
}
