package queueLinkedList;

public class Queue {
	Node front = new Node(0, null);
	Node back = front;
	
	public void enqueue(int x){
		back.next = new Node(x, null);
		back = back.next;
	}
	
	public void dequeue(){
		front.next = front.next.next;
	}
	
	
	public int front(){
		return front.next.x;
	}
	
	public int back(){
		front.next.x = front.next.x;
		return back.x;
	}
	
	public boolean isEmpty(){
		return front.next == null;
	}
}
