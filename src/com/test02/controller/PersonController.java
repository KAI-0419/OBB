package com.test02.controller;

import java.util.Scanner;
import com.test02.model.dto.Person;

public class PersonController {
	private Person[] person = new Person[2];
	Scanner sc = new Scanner(System.in);
	
	
	//회원 추가
	public void insertPerson() {
		
		for(int i=0; i<person.length; i++) {
			System.out.println("== 사원 정보 입력 ==");
			System.out.print("이름: ");
			String name = sc.nextLine();
			System.out.print("나이: ");
			int age = sc.nextInt();
			System.out.print("키: ");
			double height = sc.nextDouble();
			sc.nextLine();
			
			person[i] = new Person(name, age, height);
		}
	}
	
	//회원 전체 조회
	public void printPerson() {
		for(int i=0; i<person.length; i++) {
			System.out.println(person[i].information());
		}
	}
	
	//회원 이름 검색
	public void searchPerson() {
		System.out.print("검색할 이름: ");
		String sName = sc.nextLine();
		
		for(int i=0; i<person.length; i++) {
			if(person[i].getName().equals(sName)) {
				System.out.println(person[i].information());
				break;
			}
		}
	}
	
	
	
	
	
}
