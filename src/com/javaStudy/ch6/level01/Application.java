package com.javaStudy.ch6.level01;

public class Application {

	public static void main(String[] args) {
		
		MemberDTO member = new MemberDTO();
		
		member.getId();
		member.getPwd();
		member.getName();
		member.getAge();
		member.getGender();
		member.getPhone();
		member.getEmail();
		
		
		///getter를 이용해서 필드의 초기값 확인 
		
		System.out.println("1. getter를 이용해서 필드의 초기값 확인");
		System.out.println("id : " + member.getId());
		System.out.println("pwd : " + member.getPwd());
		System.out.println("name : " + member.getName());
		System.out.println("age : " + member.getAge());
		System.out.println("gender : " + member.getGender());
		System.out.println("phone : " + member.getPhone());
		System.out.println("email : " + member.getEmail());
		
		//setter를 이용해서 필드 값 변경 
		System.out.println("2. setter를 이용해서 필드 값 변경");
		member.setId("user01");
		member.setPwd("pass01");
		member.setName("홍길동");
		member.setAge(20);
		member.setGender('M');
		member.setPhone("010-1234-5678");
		member.setEmail("hong123@greedy.com");
		
		
		//getter를 이용해서 변경된 필드값 확인
		System.out.println("3. getter를 이용해서 변경된 필드값 확인");
		System.out.println("id : " + member.getId());
		System.out.println("pwd : " + member.getPwd());
		System.out.println("name : " + member.getName());
		System.out.println("age : " + member.getAge());
		System.out.println("gender : " + member.getGender());
		System.out.println("phone : " + member.getPhone());
		System.out.println("email : " + member.getEmail());
		
	}
}
