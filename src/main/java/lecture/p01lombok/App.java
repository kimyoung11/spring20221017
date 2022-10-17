package lecture.p01lombok;

public class App {
	public static void main(String[] args) {
		
		System.out.println("메인 메소드");
		
		JavaBean1 j1 = new JavaBean1();
		JavaBean2 j2 = new JavaBean2();
		
		j2.setCompany("tesla");
		j2.setLocation("usa");
		j2.setScore(100);
		
		System.out.println(j2.getCompany());
	}
}
