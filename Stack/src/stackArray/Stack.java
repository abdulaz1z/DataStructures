package stackArray;
/*	This is a abstract Stack class which contains fields and methods 
 * 	that don't depends on the data type. This class will be extended 
 * 	by other data depended Stack class such as StackInt, StackChar,
 * 	and StackDouble
 */

public abstract class Stack {
	//when stack is empty 
	protected int top = -1;
	
	//this removes the top item by just pointing to the item below it 
	public void pop(){
		top--;
	}
	
	//this tells us if the stack is empty
	public boolean isEmpty(){
		return top == -1;
	}
}
