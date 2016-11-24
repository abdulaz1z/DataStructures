package linkedListOneDN;

import java.util.Arrays;

import linkedListWithDummyNode.Node;

public class LinkedListODN {
	Node head = new Node(0,null);
	Node previous = head;
	private int size = 0;
	
	public LinkedListODN(){
		head.next = head;
	}
	//inserts a new item before current item
			public void insertBefore(int x){
				previous.next = new Node(x, previous.next);
				size++;
			}
			
			//inserts a new item after current item 
			public void insertAfter(int x){
				previous.next = previous.next;
				previous.next = new Node(x, previous.next);
				//insertBefore(x);		//or
				size++;
			}
			
			//removes current item
			public void remove(){
				previous.next = previous.next.next;
				size--;
			}
			
			//reports if List is empty
			public boolean isEmpty(){
				return head.next == head;
			}
			
			public void removeValue(int x){
				previous = head;
				for(int i = 0; i < size ; i++){
					if(previous.next.x != x) 	previous = previous.next;
					else remove();
				}
			}
			
			public int size(){
				return size;
			}
			
			public String printAll(){
				previous = head;
				int[] arr = new int[size];
				for(int i = 0; i < size; i++){
					previous = previous.next;
					arr[i] = previous.x;
				}
				return Arrays.toString(arr);
			}
			
	public static void main(String[] args) {
		LinkedListODN list = new LinkedListODN();
		System.out.println("Is list empty: " + list.isEmpty()); 		//should print true
		
		list.insertBefore(10);
		list.insertBefore(11);
		list.insertAfter(20);
		list.insertAfter(33);
		list.insertAfter(50);
		
		System.out.println(list.printAll());
		
		list.removeValue(10);
		
		System.out.println(list.printAll());
	}

}
