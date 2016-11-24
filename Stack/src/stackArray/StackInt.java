package stackArray;
/*	This is a subclass of Stack and this class StackInt is 
 * 	implemented for int type only. All the fields and methods 
 * 	depends on int data type
 */

public class StackInt extends Stack {
	//this declare the double type array
	private int[] arr;
	
	//constructor
	public StackInt(int size){
		//this initialize the array with size 
		arr = new int[size];
	}

	//this returns the top element in the stack using the the 
	//variable top from the parent class
	public int top(){
		return arr[top];
		
	}
	
	//this inserts an element on the top of the stack by incrementing 
	//top variable and then putting it in the int array at index top
	public void push(int x){
		top++;
		arr[top] = x;
	}
}
