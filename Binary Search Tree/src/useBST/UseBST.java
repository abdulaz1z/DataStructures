package useBST;

import bst.BST;
import bst.BSTNode;

public class UseBST {

	public static void main(String[] args) {
		BST bst = new BST();
		
		int[] data = {45,54,89,32,23,58,65,76,88,55,42,12,38,34,57,79,90,66};
		
		for(int i : data) bst.insert(i);
		
		System.out.print("Sorted:	");
		bst.printInOrder();
		
		System.out.println("\nCount: 	" + bst.count());
		System.out.println("Height: " + bst.height());
		
		BSTNode search = bst.search(1000);
		if(search != null)	System.out.println("Search:	" + search.x);
	}

}
