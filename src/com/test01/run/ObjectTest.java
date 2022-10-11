package com.test01.run;

import java.util.Scanner;
import com.test01.model.Book;

public class ObjectTest {
	public static void main(String[] args) {
		Book bk1 = new Book("자바의 정석", "이강현", "정석간", 30000);
		Book bk2 = new Book("이것이 자바다", "신용권", "한빛미디어", 40000);
		Book bk3 = new Book("모던 자바스크립트", "이웅모", "위키북스", 45000);
		
		//출력
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		//도서 검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책 제목: ");
		String searchTitle = sc.nextLine();
		
		if(bk1.getTitle().equals(searchTitle)) {
			System.out.println(bk1.information());
		}else if(bk2.getTitle().equals(searchTitle)) {
			System.out.println(bk2.information());
		}else if(bk3.getTitle().equals(searchTitle)) {
			System.out.println(bk3.information());
		}else {
			System.out.println("찾는 책 없음");
		}
		
	}
}
