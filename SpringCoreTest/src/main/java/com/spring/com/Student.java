package com.spring.com;

public class Student {

	private int studentId;
	private String studentName;
	private String studentAdress;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public Student() {
		super();

	}

	@Override
	public String toString() {
		return " [studentId=" + studentId + ", studentName=" + studentName + ", studentAdress=" + studentAdress
				+ "]";
	}

	public Student(int studentId, String studentName, String studentAdress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAdress = studentAdress;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAdress() {
		return studentAdress;
	}

	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}

}
