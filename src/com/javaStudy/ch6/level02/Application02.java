package com.javaStudy.ch6.level02;

import java.util.Scanner;

public class Application02 {

	public static void main(String[] args) {
		
		StudentVO st = new StudentVO();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학년 입력 : ");
		st.setGrade(sc.nextInt());
		sc.nextLine();
		
		System.out.print("반 입력 : ");
		st.setClassroom(sc.nextInt());
		sc.nextLine();
		
		System.out.print("이름 입력 : ");
		st.setName(sc.nextLine());
		
		System.out.print("키 입력 : ");
		st.setHeight(sc.nextDouble());
		sc.nextLine();
		
		System.out.print("성별 입력 : ");
		st.setGender(sc.next().charAt(0));
		
		st.printInformation();
		
		sc.close();
		
	}
}
