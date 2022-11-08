package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex42")
public class Controller42 {

	@RequestMapping("sub")
	private void method0() {
		
	}
	@RequestMapping("sub01")
	private void method1() {
		System.out.println("sub01 실행");
	}
}
