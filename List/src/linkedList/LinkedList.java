package linkedList;

public class LinkedList {
	//added public for testing purposes. These instance variables shouldn't be public
	public Node head;
	public Node previous;
	public Node current;
	public Node tail;
	
	//inserts a new item before current item
	public void insertBefore(int x){
		if(isEmpty()){
			head = new Node(x, null);
			current = head;
			tail = head;
		}
		else if(current == head){
			head = new Node(x, current);
			current = head;
		}
		else{
			previous.next = new Node(x, current);
			current = previous.next;
		}
		
	}
	
	//inserts a new item after current item 
	public void insertAfter(int x){
		if(isEmpty()){
			head = new Node(x, null);
			current = head;
			tail = head;
		}
		else if(head == current){
			current.next = new Node(x, current.next);
			current = current.next;
			previous = head;
			if(head == tail){
				tail = current;
			}
		}
		else{
			current.next = new Node(x, current.next);
			current = current.next;
			previous = previous.next;
			if(current.next == null){
				tail = current;
			}
		}
	}
	
	//removes current item
	public void remove(){
		previous.next = current.next;
		current = current.next;
	}
	
	//reports if List is empty
	public boolean isEmpty(){
		return head == null && current == null && tail == null;
	}
	
	public static void main(String[] args){
		LinkedList l = new LinkedList();
		System.out.println(l.isEmpty());
	}

}
