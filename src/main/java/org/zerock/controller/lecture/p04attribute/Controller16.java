package org.zerock.controller.lecture.p04attribute;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.lecture.JavaBean01;
import org.zerock.domain.lecture.JavaBean02;
import org.zerock.domain.lecture.Student;

import lombok.Data;

@Controller
@RequestMapping("ex16")
public class Controller16 {
	
	@RequestMapping("sub01")
	private void method(HttpServletRequest req) {
		req.setAttribute("myname","AAAA");
	}
	
	@RequestMapping("sub02")
	private void method2(HttpServletRequest req) {
		req.setAttribute("address", "seoul");
	}
	
	@RequestMapping("sub03")
	private void method3(Model model) {
		model.addAttribute("email","abc@daum.net");
	}
	
	@RequestMapping("sub04")
	private void method4(Model model) {
		model.addAttribute("name","AAA");
		model.addAttribute("age","1");
		model.addAttribute("address","BBB");
		model.addAttribute("email","AAA@CCC");
	}
	
	@RequestMapping("sub05")
	private void method05(Model model) {
		JavaBean01 bean01 = new JavaBean01();
		bean01.setAddress("seoul");
		bean01.setEmail("AA@bbb");
		bean01.setName("KKK");
		
		model.addAttribute("bean", bean01);
	}
	@RequestMapping("sub06")
	private void method06(Model model) {
		Student st = new Student();
		st.setClassName("ddd");
		st.setName("bbb");
		model.addAttribute("std",st);
	}
	
	@RequestMapping("sub07")
	private void method07(
			@ModelAttribute("bean") JavaBean01 b) {
	}
	
	@RequestMapping("sub08")
	private void method08(
			@ModelAttribute("bean") JavaBean02 b) {
		
	}
}
