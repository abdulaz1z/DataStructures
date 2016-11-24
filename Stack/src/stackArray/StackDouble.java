package stackArray;
/*	This is a subclass of Stack and this class StackDouble is 
 * 	implemented for double type only. All the fields and methods 
 * 	depends on double data type
 */

public class StackDouble extends Stack {
	//this declare the double type array
	private double[] arr;
	
	//constructor
	public StackDouble(int size){
		//this initialize the array with size 
		arr = new double[size];
	}

	//this returns the top element in the stack using the the 
	//variable top from the parent class
	public double top(){
		return arr[top];
		
	}
	
	//this inserts an element on the top of the stack by incrementing 
	//top variable and then putting it in the double array at index top
	public void push(double x){
		top++;
		arr[top] = x;
	}
}
