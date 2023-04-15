package com.javaStudy.ch8.hw1;

public class Student extends Person {

	private int grade;		// 학년
	private String major;	// 전공
	
	public Student() {
		super();
	}
	
	
	public Student(int grade, String major) {
		super();
		this.grade = grade;
		this.major = major;
	}


	public Student(String name, int age, double height, double weight,int grade, String major) {
		super(name, age, height, weight);
		
		this.grade = grade;
		this.major = major;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	@Override
	public String information() {
		return super.information()
			+ ", grade=" + grade
			+ ", major=" + major;
	}

}