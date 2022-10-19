package org.zerock.controller.lecture.p03forward;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex14")
public class Controller14 {
	
	@RequestMapping("sub01")
	private void method1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("메소드 1번 호출");
		String path = "/WEB-INF/views/ex14/sub01.jsp";
		req.getRequestDispatcher(path).forward(req, res);
	}

	@RequestMapping("sub02")
	private String method2() {
		System.out.println("메소드 2번 호출");
		return "abc";
	}
	//String return -> prefix에 /WEB-INF/views 추가해주고 suffix에 .jsp 추가해준다
	@RequestMapping("sub03")
	private String method3() {
		System.out.println("메소드 3번 호출");
		return "xyz";
	}
	
	@RequestMapping("sub04")
	private String method4() {
		return "ex14/sub04";
	}
	
	@RequestMapping("sub05")
	private String method5(){
		return "ex14/sub05";
	}
}
