package queueArray;

public class QueueCircularArray {
	int[] array;		//change data type based on data type 
	int front = 0;
	int back = -1;
	
	public QueueCircularArray(int size){
		array = new int[size];
		
	}
	
	public void enqueue(int x){
		back = (back + 1) % array.length;
		array[back] = x;
	}
	
	public void dequeue(){
		front = (front + 1) % array.length;
	}
	
	public int front(){
		return array[front];
	}
	
	public int back(){
		return array[back];
	}
	
	public boolean isEmpty(){
		return back < front || back == front -1;
	}
	
}
