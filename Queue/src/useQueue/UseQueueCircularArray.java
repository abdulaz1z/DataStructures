package useQueue;

import queueArray.QueueCircularArray;
import queueLinkedList.Queue;

public class UseQueueCircularArray {

	public static void main(String[] args) {
		QueueCircularArray q = new QueueCircularArray(3);		//pass size base how many data you have
		
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
