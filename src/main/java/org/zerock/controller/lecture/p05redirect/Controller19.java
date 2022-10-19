package org.zerock.controller.lecture.p05redirect;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex19")
public class Controller19 {
	
	@RequestMapping("sub01")
	public void method1(HttpServletResponse res) throws IOException {
		//다른곳으로 redirect 하고싶어요 -> 다른곳으로 보내기
		String location = "sub02";
		res.sendRedirect(location);
	}
	
	@RequestMapping("sub03")
	public String method2() {
		return "redirect:sub04";
	}
	
	@RequestMapping("sub05")
	public String method3() {
		return "redirect:sub06";
	}
	
	@RequestMapping("sub11")
	public String method4(HttpServletRequest req) {
		String url = req.getContextPath() +"/ex19/sub12";
		return "redirect:" + url;
	}
	
}
