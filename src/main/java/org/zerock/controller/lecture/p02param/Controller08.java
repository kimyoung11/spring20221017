package org.zerock.controller.lecture.p02param;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex08")
public class Controller08 {
	//request 받는법
	@GetMapping("sub01")
	private void method1(HttpServletRequest request) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println(name + " " + age);
	}
	
	@GetMapping("sub03")
	private void method2(HttpServletRequest request) {
		String address = request.getParameter("address");
		System.out.println(address);
	}
}
