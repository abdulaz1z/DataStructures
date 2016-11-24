package linkedListWithDummyNode;

import java.util.Arrays;

public class LinkedListDN {
	//added public for testing purposes. These instance variables shouldn't be public
		Node tail = new Node(0, null);
		Node head = new Node(0,tail);
		Node previous = head;
		Node current = head;
		
		private int size = 0;
		
		
		//inserts a new item before current item
		public void insertBefore(int x){
			previous.next = new Node(x, previous.next);
			current = previous.next;
			size++;
		}
		
		//inserts a new item after current item 
		public void insertAfter(int x){
			current.next = new Node(x, current.next);
			previous = current;
			current = current.next;
			size++;
		}
		
		//removes current item
		public void remove(){
			previous.next = current.next;
			current = current.next;
			size--;
		}
		
		//reports if List is empty
		public boolean isEmpty(){
			return tail == head.next;
			
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
		
		public int size(){
			return size;
		}
		
		public static void main(String[] args){
			LinkedListDN ll = new LinkedListDN();
			System.out.println("Is it empty: " + ll.isEmpty());
			
			ll.insertAfter(12);
			ll.insertAfter(20);
			ll.insertAfter(30);
			
			System.out.println(ll.printAll());
			
		}

}
