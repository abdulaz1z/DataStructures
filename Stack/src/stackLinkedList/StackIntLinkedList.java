 package stackLinkedList;

public class StackIntLinkedList {
	private Node top = null;

	public void push(int x){
		top = new Node(x, top);
	}
	
	public void pop(){
		top = top.next;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public int top(){
		return top.x;
	}
}
