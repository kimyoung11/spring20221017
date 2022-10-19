package org.zerock.domain.lecture;




public class JavaBean03 {
	private int score;
	private String className;
	private String studentNumber;
	private String location;
	private double avg;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "JavaBean03 [score=" + score + ", className=" + className + ", studentNumber=" + studentNumber
				+ ", location=" + location + ", avg=" + avg + "]";
	}

	
	
	
}
