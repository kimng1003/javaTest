package com.javaStudy.ch8.hw1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Person[] person1 = new Student[3];
		
		person1[0] = new Student("홍길동", 20, 178.20, 70.0, 1, "정보시스템공학과");
		person1[1] = new Student("김말똥", 21, 187.30, 80.0, 2, "경영학과");
		person1[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(Person a : person1) {
			System.out.println(a.information());
		}
	
		System.out.println(" --------- ");
		
		Person[] person2 = new Employee[10];
		
		int count = 0;
		while(true) {
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.nextLine();

			person2[count] = new Employee(name, age, height, weight, salary, dept);
			count++;
			
			System.out.println("계속 입력? (y/n)");
			String str = sc.nextLine().toUpperCase();
			
			if(str.equals("N")) {
				break;
			}
			
		}
		for(Person a : person2) {
			System.out.println(a.information());
		}
		System.out.println("done");
	}
}
