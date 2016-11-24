package useQueue;

import queueLinkedList.Queue;

public class UseQueueLinked {

	public static void main(String[] args) {
		Queue q = new Queue();
		//line starts here
		q.enqueue(10);
		q.enqueue(5);
		q.enqueue(15);
		System.out.println("First item on line: " + q.front());		//should print 10
		System.out.println("Last item on line: " + q.back());		//should print 15
		
		//lets dequeue
		q.dequeue(); 
		System.out.println("Now first item on line: " + q.front());	//should print 5
		
		//dequeue again
		q.dequeue();
		System.out.println("Now first item on line: " + q.front());	//should print 15
		
		//dequeue again 
		q.dequeue();	//this should make the queue empty
		
		System.out.println("Is Queue empty now: " + q.isEmpty());	//should print true
			
		
	}

}
