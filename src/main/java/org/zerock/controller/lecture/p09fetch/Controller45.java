package org.zerock.controller.lecture.p09fetch;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.lecture.JavaBean20;
import org.zerock.domain.lecture.JavaBean25;
import org.zerock.domain.lecture.JavaBean26;
import org.zerock.domain.lecture.JavaBean28;

@Controller
@RequestMapping("ex45")
public class Controller45 {

	@RequestMapping("sub")
	private void method1() {

	}
	
	@RequestMapping("sub01")
	public ResponseEntity method01() {
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping("sub02")
	public ResponseEntity method02() {
		return ResponseEntity.status(202).build();
	}
	
	@RequestMapping("sub03")
	public ResponseEntity method03() {
		return ResponseEntity.accepted().build();
	}
	
	@RequestMapping("sub04")
	public ResponseEntity method04() {
		return ResponseEntity.ok().header("My-Header", "Value").build();
	}
	
	@RequestMapping("sub07")
	public ResponseEntity<JavaBean20> method07() {
		JavaBean20 data = new JavaBean20();
		data.setName("손흥민");
		data.setAddress("서울");
		return ResponseEntity.ok().body(data);
	}
	
	@RequestMapping("sub08")
	public ResponseEntity<JavaBean28> method08(){
		JavaBean28 data = new JavaBean28();
		data.setName("박지성");
		data.setDate(LocalDate.now());
		data.setDateTime(LocalDateTime.now());
		
		return ResponseEntity.ok(data);
	}
	
	@RequestMapping("sub11")
	@ResponseBody
	public JavaBean28 method11() {
		JavaBean28 data = new JavaBean28();
		data.setName("A");
		data.setDate(LocalDate.now());
		data.setDateTime(LocalDateTime.now());
		
		return data;
	}
	
	@GetMapping("sub13")
	@ResponseBody
	public Map<String, String> method13() {
		Map<String, String> map = new HashMap<>();
		map.put("address", "서울");
		map.put("email", "abc@gmail.com");
		map.put("age", "33");
		
		return map;
	}
	
	@GetMapping("sub14")
	@ResponseBody
	public Map<String, Object> method14() {
		Map<String, Object> map = new HashMap<>();
		JavaBean25 data = new JavaBean25();
		JavaBean26 sub = new JavaBean26();
		
		sub.setAddress(List.of("제주", "울릉도"));
		sub.setMarried(false);
		
		data.setAge(99);
		data.setInfo(sub);
		
		map.put("address", "부산");
		map.put("age", 33);
		map.put("married", true);
		map.put("data", data);
		
		return map;
	}
	
	@GetMapping("sub15")
	@ResponseBody
	public Map<String, Object> method15(){
		Map<String, Object> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		list.add("blue");
		list.add("red");
		map.put("car","tesla");
		map.put("model","avante");
		map.put("color", list);
		
		return map;
	}
	
	
	
	
	
	
	
}
