package org.zerock.controller.lecture.p07mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.lecture.JavaBean18;
import org.zerock.domain.lecture.JavaBean19;
import org.zerock.mapper.lecture.Mapper10;

@Controller
@RequestMapping("ex36")
public class Controller36 {
	
	@Autowired
	private Mapper10 mapper;
	
	@RequestMapping("sub01")
	private void method1() {
		int cnt = mapper.removeCustomer();
		System.out.println(cnt + "개 레코드 삭제됨");
	}
	
	@RequestMapping("sub02")
	private void method2() {
		int cnt = mapper.removeEmployee();
		System.out.println(cnt + "개 직원 레코드 삭제됨");
	}
	
	@RequestMapping("sub03")
	private void method3(@RequestParam(name = "id", defaultValue = "0")int id) {
		int cnt = mapper.removeCustomerById(id);
		System.out.println(cnt + "개 직원 레코드 삭제됨");
	}
	
	@RequestMapping("sub04")
	private void method4(@RequestParam(name="id", defaultValue = "0")int id) {
		int cnt = mapper.removeEmployeeById(id);
		System.out.println(cnt+"개 직원 레코드 삭제됨");
	}
	
	@RequestMapping("sub05")
	private void method5() {
		int cnt = mapper.addCustomer();
		System.out.println(cnt);
	}
	
	@RequestMapping("sub06")
	private void method6() {
		int cnt = mapper.addSupplier();
		System.out.println(cnt+ "개 공급자 정보 입력됨");
	}
	
	@GetMapping("sub07")
	private void customerForm() {
		
	}
	
	@PostMapping("sub07")
	private void method7(JavaBean18 customer) {
		int cnt = mapper.insertCustomer(customer);
		System.out.println(cnt+"개 고객 정보 입력됨");
	}
	
	@GetMapping("sub08")
	private void supplierForm() {

	}
	
	@PostMapping("sub08")
	private void method8(JavaBean19 supplier) {
		int cnt = mapper.insertSupplier(supplier);
		System.out.println(cnt+ "개 공급자 정보 입력됨");
	}
	
	@GetMapping("sub09")
	public String getMehod9() {
		return "/ex36/sub07";
	}
	
	@PostMapping("sub09")
	public String postMethod9(JavaBean18 customer, RedirectAttributes rttr) {
		System.out.println(customer.getId());
		int cnt = mapper.insertCustomerAndKey(customer);
		System.out.println(cnt+"개 고객 정보 입력");
		System.out.println(customer.getId());
		rttr.addFlashAttribute("memo",customer.getId());
		return "redirect:/ex36/sub09";
	}
	
	@GetMapping("sub10")
	public String method10() {
		//forward to /web-inf/views/ex36/sub08.jsp
		return "/ex36/sub08";
	}
	
	@PostMapping("sub10")
	public String postMethod10(JavaBean19 supplier, RedirectAttributes rttr) {
		// 1.request parameter 수집 javabean19
		// 2. business logic : Suppliers 테이블에 레코드입력 generated key 얻기
		// 3. add attribute : (message : id번 공급자 입력)
		// 4. redirect : /ex36/sub10
		System.out.println(supplier.getId());
		int cnt = mapper.insertSupplierAndKey(supplier);
		System.out.println(cnt+"개 고객 정보 입력");
		System.out.println(supplier.getId());
		rttr.addFlashAttribute("message", supplier.getId());
		return "redirect:/ex36/sub10";
	}
}

