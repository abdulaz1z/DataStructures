package stackArray;
/*	This is a subclass of Stack and this class StackChar is 
 * 	implemented for char type only. All the fields and methods 
 * 	depends on char data type
 */

public class StackChar extends Stack {
	//this declare the char type array
	private char[] arr;
	
	//constructor
	public StackChar(int size){
		//this initialize the array with size 
		arr = new char[size];
	}

	//this returns the top element in the stack using the the 
	//variable top from the parent class
	public char top(){
		return arr[top];
		
	}
	
	//this inserts an element on the top of the stack by incrementing 
	//top variable and then putting it in the char array at index top 
	public void push(char x){
		top++;
		arr[top] = x;
	}
}
