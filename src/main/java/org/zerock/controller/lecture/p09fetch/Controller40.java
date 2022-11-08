package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex40")
public class Controller40 {
	
	@RequestMapping("sub01")
	private void method0() {
		//jsp로 포워드
		
	}
	@RequestMapping("sub02")
	private void method1() {
		System.out.println("/ex40/sub02 get방식 요청 잘받음");
	}
	
	@RequestMapping("sub03")
	private void method2() {
		System.out.println("/ex40/sub03 POST방식 요청 잘받음");
	}
	
	@GetMapping("sub04")
	private void method3() {
		System.out.println("get방식요");
	}
	
	@PostMapping("sub04")
	private void method4() {
		System.out.println("post방식요");
	}
	
	//@RequestMapping(path = "sub04", method = RequestMethod.PUT)
	@PutMapping("sub04")
	private void method6() {
		System.out.println("put 방식 요청 잘받음");
	}
	
	//@DeleteMapping("sub04")
	@RequestMapping(path = "sub04", method = RequestMethod.DELETE)
	private void method7() {
		System.out.println("delete 방식 요청 잘받음");
	}
	
	@GetMapping("sub05")
	private void method8() {
		System.out.println("get방식요");
	}
	@PostMapping("sub05")
	private void method9() {
		System.out.println("post방식요");
	}
	@PutMapping("sub05")
	private void method10() {
		System.out.println("put방식요");
	}
	@DeleteMapping("sub05")
	private void method11() {
		System.out.println("delete방식요");
	}
}
