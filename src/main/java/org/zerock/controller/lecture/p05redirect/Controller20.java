package org.zerock.controller.lecture.p05redirect;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.lecture.JavaBean03;
import org.zerock.domain.lecture.Student;


@Controller
@RequestMapping("ex20")
public class Controller20 {
	//redirect 데이터넘겨주는법
	
	@RequestMapping("sub01")
	private String method1() {
		return "redirect:/ex20/sub02?name=ronaldo";
	}
	
	@RequestMapping("sub02")
	private void method2(String name) {
		System.out.println("redirect 실행");
		System.out.println(name);
	}
	
	@RequestMapping("sub03")
	private String method3() {
		return "redirect:/ex20/sub04?address=seoul&age=30";
	}
	
	@RequestMapping("sub04")
	private void method4(String address, int age) {
		System.out.println(address + " " + age);
		System.out.println("redirect 완료");
	}
	
	@RequestMapping("sub05")
	private String method5(RedirectAttributes rttr) {
		rttr.addAttribute("age",99);
		rttr.addAttribute("email","abc@daum.net");
		return "redirect:/ex20/sub06";
	}
	
	@RequestMapping("sub06")
	private void method6(int age, String email) {
		System.out.println(age + " " + email);
		System.out.println("redirect 완료");
	}
	
	@RequestMapping("sub07")
	private String method7(HttpSession session) {
		Student st = new Student();
		st.setClassName("JJ");
		st.setName("KK");
		st.setStudentNumber("LL");
		session.setAttribute("student", st);
		return "redirect:/ex20/sub08";
	}
	
	@RequestMapping("sub08")
	private void method8(HttpSession session) {
		Student temp = (Student) session.getAttribute("student");
		System.out.println(temp.getClassName());
		System.out.println(temp.getName());
		System.out.println(temp.getStudentNumber());
	}
	
//	@RequestMapping("sub08")
//	public void method8(Student student) {
//		System.out.println(student);
//	}
	
	@RequestMapping("sub09")
	public String method9(RedirectAttributes rttr) {
		JavaBean03 bean = new JavaBean03();
		bean.setAvg(1);
		bean.setClassName("aa");
		bean.setLocation("bb");
		bean.setScore(50);
		bean.setStudentNumber("cc");
		
		rttr.addFlashAttribute("javaBean03",bean);
		return "redirect:/ex20/sub10";
	}
	
	@RequestMapping("sub10")
	public void method10(JavaBean03 bean) {
		System.out.println(bean);
	}
}
