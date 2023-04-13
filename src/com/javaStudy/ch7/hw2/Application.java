package com.javaStudy.ch7.hw2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		StudentDTO[] arr = new StudentDTO[10];
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
		System.out.print("학년 입력 : ");
		int grade = sc.nextInt();
		System.out.print("반 입력 : ");
		int classroom = sc.nextInt();
		System.out.print("이름 입력 : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		sc.nextLine();
		
		arr[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
		count++;
		
		System.out.println("계속 추가? y/n");
		char answer = sc.next().charAt(0);
			if(answer == 'n' || answer == 'N') {
				break;
			}
		}
		for(StudentDTO a : arr) {
			if(a == null) {
				break;
			}
			int avg = (a.getEng() + a.getKor() + a.getMath()) / 3;
			System.out.println(a.information() + ", 평균점수 : " + avg);
		} 
		System.out.println("Done");
	}
}