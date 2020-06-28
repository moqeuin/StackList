package main;

import stack.StackList;

public class mainClass {

	public static void main(String[] args) {
		
		StackList sl = new StackList();
		// 데이터 2개를 삽입.
		String str1 = "aaa";
		String str2 = "bbb";
		sl.push(str1);
		sl.push(str2);
		
		
		System.out.println("TOP : " + sl.pop());
		System.out.println("TOP : " + sl.pop());
		// 데이터가 비어있을 떄.
		System.out.println("TOP : " + sl.pop());
		
		// push한 데이터를 다시 peek해서 저장.
		sl.push("ccc");
		String str3 = (String)sl.peek();
		sl.push(str3);
		
		// 다른 자료형의 데이터 저장.
		int num = 3;
		sl.push(num);
		
		int num2 = (int)sl.peek();
		System.out.println("TOP : " + num2);
	}
		
	
}
