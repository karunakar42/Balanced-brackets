package com.leetcode;
import java.util.Stack;

public class BalancedBrackets1 {
	static boolean ispr(String value) {
		if (value.length()%2==0) {
			Stack<Character> chars=new Stack<Character>();
			for (int i = 0; i < value.length(); i++) {
				if (value.charAt(i)=='{'||value.charAt(i)=='['||value.charAt(i)=='(')
					chars.push(value.charAt(i));
				char val;
				switch (value.charAt(i)) {
				case '}':
					val=chars.pop();
					if (val=='('||val=='[') 
						return false;
					break;
				case ')':
					val=chars.pop();
					if (val=='{'||val=='[') 
						return false;
					break;
				case ']':
					val=chars.pop();
					if (val=='('||val=='{') 
						return false;
					break;
				}
			}
			return chars.isEmpty();
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		String statement="([{}])";
		if (ispr(statement)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not balanced");
		}
	}
}
