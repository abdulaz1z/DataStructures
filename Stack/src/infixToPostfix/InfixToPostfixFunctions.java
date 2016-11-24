package infixToPostfix;

import java.util.StringTokenizer;

import stackArray.StackChar;
import stackArray.StackDouble;
import stackLinkedList.StackIntLinkedList;

public class InfixToPostfixFunctions {
	
	public static int precedence(char op) {
		if (op == '^')					return 3;
		if ((op == '*') || (op == '/'))	return 2;
		if ((op == '+') || (op == '-'))	return 1;
		return 0;
	}
	
	public static boolean isOperator(char op) {
		return ((op == '^') || (op == '*') || (op == '/') || (op == '+') || (op == '-'));
	}
	
	
	public static boolean isOperatorWithParenthesis(char op) {
		return ((op == '(') || (op == ')') || (op == '^') || (op == '*') || (op == '/') || (op == '+') || (op == '-'));
	}
	
	
	
	public static int evalPostfix(String s) {
		StackIntLinkedList stack = new StackIntLinkedList();

		for (int i = 0; i < s.length(); i++) {
			char op = s.charAt(i);
			// look for operator
			if (isOperator(op)) {
				int b = stack.top();
				stack.pop();
				int a = stack.top();
				stack.pop();

				if (op == '^')
					stack.push((int) Math.pow(a, b));
				if (op == '*')
					stack.push(a * b);
				if (op == '/')
					stack.push(a / b);
				if (op == '+')
					stack.push(a + b);
				if (op == '-')
					stack.push(a - b);
			}
			// look for operands
			else {
				stack.push(op - '0');
			}

		}
		return stack.top();
	}
	
	public static double evalDoublePostfix(String str) {
		StackDouble stack = new StackDouble(str.length() / 2 + 1 );
		
		StringTokenizer strToken = new StringTokenizer(str);
		
		String firstToken = "";
		char op;
		
		while(strToken.hasMoreElements()){
			firstToken = strToken.nextToken();
			op = firstToken.charAt(0);
			
			if(isOperator(op)){
				double b = stack.top();		stack.pop();
				double a = stack.top();		stack.pop();
				
				if (op == '^')
					stack.push(Math.pow(a, b));
				if (op == '*')
					stack.push(a * b);
				if (op == '/')
					stack.push(a / b);
				if (op == '+')
					stack.push(a + b);
				if (op == '-')
					stack.push(a - b);
			}
			else{
				stack.push(Double.parseDouble(firstToken));
			}
			
		}
		
		return stack.top();
	}
	
	public static String addSpace(String str){
		String output = "";
		
		for(int i = 0; i < str.length(); i++){
			char op = str.charAt(i);
			if(isOperatorWithParenthesis(op)){
				output += " " + op + " ";
			}
			else{
				output += op;
			}
		}
		return output;
	}
	
	public static String infixToPostfix(String infix) {
		StackChar stack = new StackChar(infix.length() / 2);
		String postfix = "";

		for (int i = 0; i < infix.length(); i++) {
			char op = infix.charAt(i);

			if (isOperator(op)) {
				while ((!stack.isEmpty() && precedence(op) <= precedence(stack.top()))) {
					postfix += stack.top();
					stack.pop();
				}
				stack.push(op);
			}

			else if (op == '(') {
				stack.push(op);
			} 
			
			else if (op == ')') {
				while (stack.top() != '(') {
					postfix += stack.top();
					stack.pop();
				}
				stack.pop();
			} 
			
			else {
				postfix += op;
			}
		}

		while (!stack.isEmpty()) {
			postfix += stack.top();
			stack.pop();
		}
		return postfix;

	}
	
	public static String infixToPostfixDouble(String str){
		StackChar stack = new StackChar(str.length() / 2);
		
		StringTokenizer strToken = new StringTokenizer(str);
		String firstToken = "";
		String postfix = "";
		char op;
		
		while(strToken.hasMoreTokens()){
			firstToken = strToken.nextToken();
			op = firstToken.charAt(0);
			
			if(isOperator(op)){
				while ((!stack.isEmpty() && precedence(op) <= precedence(stack.top()))) {
					postfix += stack.top() + " ";
					stack.pop();
				}
				stack.push(op);
			}
			
			else if (op == '(') {
				stack.push(op);
			}
			
			else if (op == ')') {
				while (stack.top() != '(') {
					postfix += stack.top() + " ";
					stack.pop();
				}
				stack.pop();
			} 
			
			else {
				postfix += firstToken + " ";
			}
			
		}
		
		while (!stack.isEmpty()) {
			postfix += stack.top() + " ";
			stack.pop();
		}
		
		return postfix;
			
}

}
