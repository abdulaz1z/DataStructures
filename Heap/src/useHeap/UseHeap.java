package useHeap;

import java.util.Arrays;

import heap.Heap;

public class UseHeap {

	public static void main(String[] args) {
		int[] arr = {55,71,29,322,33};
		
		System.out.println("Original Values: " + Arrays.toString(arr));
		
		Heap heap = new Heap();
		System.out.println("Sorted : " + Arrays.toString(heap.heapSort(arr)));

	}

}
