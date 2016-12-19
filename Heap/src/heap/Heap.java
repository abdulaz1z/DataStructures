package heap;

public class Heap
{
	private int[] value;
	private int last = -1;
	private final int ROOT = 0;
	
	public int[] heapSort(int[] array)
	{
		value = array;
		
		for(int i = 0; i < value.length; i++)
		{
			insert();
		}
		
		for(int j = 0; j < value.length; j++)
		{
			remove();
		}
		return value;
	}
	
	public void insert()
	{
		last++;
		heapifyUpwards(last);
		
	}
	
	public void remove()
	{
		swap(0, last);
		last--;
		heapifyDownwards(ROOT);
	}

	private void heapifyUpwards(int node)
	{
		if((!(node <= ROOT)) && (value[node] > value[parent(node)]))
		{
			swap(node, parent(node));
			heapifyUpwards(parent(node));
		}
	}
	
	private void heapifyDownwards(int node)
	{
		if((right(node) <= last) && 
		  ((value[right(node)] > value[left(node)]) && (value[right(node)] > value[node])))
			{
				swap(right(node), node);
				heapifyDownwards(right(node));
			}
		else
		if((left(node) <= last) && (value[left(node)] > value[node]))
		{
			swap(left(node), node);
			heapifyDownwards(left(node));
		}
	}
	
	private int parent(int n) 
	{
		return (n - 1) / 2;
	}
	
	private int left(int n) 
	{
		return (2 * n) + 1 ;
	}
	
	private int right(int n) 
	{
		return (2 * n) + 2 ;
	}

	private void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
}
