package lecture.p11core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Example1 {
	private Example2 ex2;
	
	// 생성자 DI(dependency injection)
	// 코드 작성
	@Autowired
	public Example1(Example2 a) {
		this.ex2 =a;
	}
	
//	public Example1() {
//		
//	}

	
	public Example2 getEx2() {
		return ex2;
	}
}