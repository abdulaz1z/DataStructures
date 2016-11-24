package useList;

import linkedList.LinkedList;

public class UseLinkedList {

	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		
		System.out.println("is the list empty: " + ll.isEmpty());			//should print true

		//adding items
		ll.insertAfter(10);
		ll.insertAfter(20);
		ll.insertAfter(30);

		
		System.out.println("is the list empty: " + ll.isEmpty());			//should print false
		
		System.out.println("The first item: " + ll.head.x);					//should print 10
		System.out.println("The second item: " + ll.head.next.x);			//should print 20
		System.out.println("The current item: " + ll.current.x);			//should print 30
		
		//inserting an item before 
		ll.insertBefore(50);
		System.out.println("Now the current item is: " + ll.current.x);		//should print 50
		
	}
}
