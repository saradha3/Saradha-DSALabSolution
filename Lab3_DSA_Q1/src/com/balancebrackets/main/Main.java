package com.balancebrackets.main;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	static void isBalanced(String str) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)=='(') || (str.charAt(i)=='[') || (str.charAt(i)=='{') ) {
				stack.push(str.charAt(i));
			}
			if((str.charAt(i)==')') && (!stack.isEmpty())) {
				if(stack.peek()== '(')
					stack.pop();
				else
					break;
				//stack.pop();
			}
			if((str.charAt(i)==']') && (!stack.isEmpty())) {
				if(stack.peek()== '[')
					stack.pop();
				else
					break;
			}
			if((str.charAt(i)=='}') && (!stack.isEmpty())) {
				if(stack.peek()== '{')
					stack.pop();
				else
					break;
			}
		}
		if(stack.isEmpty())
			System.out.println("The entered string has Balanced Brackets");
		else
			System.out.println("The entered string do not contain Balanced Brackets");

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string value:");
		String str = sc.next();
		isBalanced(str);
		
	}

}
