package com.test01.run;

import java.util.Scanner;

import com.test01.model.Book;

public class ObjectArrayTest {
	public static void main(String[] args) {
		
//		Book[] bk = new Book[3];
//		bk[0] = new Book();
//		bk[1] = new Book();
//		bk[2] = new Book();

		Book[] bk = {   new Book("자바의 정석", "이강현", "정석간", 30000),
						new Book("이것이 자바다", "신용권", "한빛미디어", 40000),
						new Book("모던 자바스크립트", "이웅모", "위키북스", 45000)};
		
		System.out.println(bk);
		System.out.println(bk[1]);
		System.out.println(bk[1].getWriter());
		System.out.println(bk.length);
		
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i].information());
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책 제목: ");
		String sTitle = sc.nextLine();
		
		for(int i=0; i<bk.length; i++) {
			if(bk[i].getTitle().equals(sTitle)) {
				System.out.println(bk[i].information());
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
