package com.javaStudy.ch6.level03;

import java.util.Scanner;

public class Application {

	public final static void main(String[] args) {
		
		EmployeeDTO em = new EmployeeDTO();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		em.setNumber(sc.nextInt());
		sc.nextLine();
		
		System.out.print("이름 입력 : ");
		em.setName(sc.nextLine());
		
		System.out.print("부서 입력 : ");
		em.setDept(sc.nextLine());
		
		System.out.print("직급 입력 : ");
		em.setJob(sc.nextLine());
		
		System.out.print("나이 입력 : ");
		em.setAge(sc.nextInt());
		
		System.out.print("성별 입력 : ");
		em.setGender(sc.next().charAt(0));
		
		System.out.print("월급 입력 : ");
		em.setSalary(sc.nextInt());
		sc.nextLine();
		
		System.out.print("보너스 입력 : ");
		em.setBonusPoint(sc.nextDouble());
		sc.nextLine();
		
		System.out.print("핸드폰번호 입력 : ");
		em.setPhone(sc.nextLine());
		
		System.out.print("주소 입력 : ");
		em.setAddress(sc.nextLine());
		
		
		System.out.println(em.getNumber());
		System.out.println(em.getName());
		System.out.println(em.getDept());
		System.out.println(em.getJob());
		System.out.println(em.getAge());
		System.out.println(em.getGender());
		System.out.println(em.getSalary());
		System.out.println(em.getBonusPoint());
		System.out.println(em.getPhone());
		System.out.println(em.getAddress());
		
		sc.close();
	}
}
