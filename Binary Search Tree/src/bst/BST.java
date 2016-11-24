package bst;

public class BST 
{
	BSTNode root = null;
	
	public void insert(int value)
	{
		if(root == null)	root = new BSTNode(value);
		else 				root.insert(value);
	}
	
	public int height()
	{
		if(root == null)	return 0;
		else 				return root.height();
	}
	
	public int count()
	{
		if(root == null)	return 0;
		else 				return root.count();
	}
	
	public BSTNode search(int value)
	{
		if(root == null)	return null;
		else 				return root.search(value);
	}
	
	public void printInOrder()
	{
		if(root != null)	root.printInOrder();
	}

}
