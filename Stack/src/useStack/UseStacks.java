package useStack;

import infixToPostfix.InfixToPostfixFunctions;


public class UseStacks extends InfixToPostfixFunctions{

	public static void main(String[] args) {
		String infix = "9-2*(6-4/(3-1))+2";
		System.out.println("Infix Ex: " + infix);
		String postfix = infixToPostfix(infix);
		System.out.println("Postfix Ex: " + postfix);
		int result = evalPostfix(postfix);
		System.out.println("Answer: " + result);

	}

}
