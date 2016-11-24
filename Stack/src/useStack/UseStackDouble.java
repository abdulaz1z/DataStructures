package useStack;

import infixToPostfix.InfixToPostfixFunctions;

public class UseStackDouble extends InfixToPostfixFunctions {

	public static void main(String[] args) {
		String infix = "1.1+2.1*1.1";
		System.out.println("Infix: " + infix);
		
		String infixWithSpace = addSpace(infix);
		System.out.println("Infix with space: " + infixWithSpace);
		
		String postfixWithSpace = infixToPostfixDouble(infixWithSpace);
		System.out.println("Postfix with space: " + postfixWithSpace);
		
		System.out.println("Answer: " + evalDoublePostfix(postfixWithSpace));
	
		
	}


}
