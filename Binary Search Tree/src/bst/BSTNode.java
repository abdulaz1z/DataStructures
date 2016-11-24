package bst;

public class BSTNode {
	public BSTNode left = null;
	public int x;
	public BSTNode right = null;
	
	public BSTNode(int value){
		x = value;
	}
	
	public void printInOrder(){
		if(left != null)	left.printInOrder();
		System.out.print("[" + x + "]" + " ");
		if(right != null)	right.printInOrder();
	}
	
	public void min(){
		if(left != null)	left.min();
		else System.out.println(x);
	}
	
	public void max(){
		if(right != null)	right.max();
		else System.out.println(x);
	}
	
	public void insert(int value){
		if(value < x){
			if(left != null)	left.insert(value);
			else left = new BSTNode(value);
		}
		if(value > x){
			if(right != null)	right.insert(value);
			else right = new BSTNode(value);
		}
	}
	
	public int count(){
		int count = 0;
		if(left != null) count += left.count();
		if(right != null) count += right.count();
		return count + 1;
	}
	
	public int sum(){
		int value = x;
		if(left != null) value += left.sum();
		if(right != null) value += right.sum();
		return value;
	}
	
	public int height(){
		int lHeight = 0;
		int rHeight = 0;
		
		if(left != null) lHeight = left.height();
		if(right != null) rHeight = right.height();
		
		return compare(lHeight, rHeight) + 1;
	
	}

	private int compare(int x, int y) {
		if(x > y) return x;
		if(x < y) return y;
		return x;
	}
	
	public BSTNode search(int value){
		if((value < x) && (left != null)) return left.search(value);
		if((value > x) && (right != null)) return right.search(value);
		if(value == x) return this;
		return null;
	}
}
