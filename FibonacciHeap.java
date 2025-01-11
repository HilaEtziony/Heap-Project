/**
 * FibonacciHeap
 *
 * An implementation of Fibonacci heap over positive integers.
 *
 */
public class FibonacciHeap
{
	public HeapNode min;
	public int TotalLinks;
	public int Totalcuts;
	public int Size;
	public int NumTrees;

	/**
	 *
	 * Constructor to initialize an empty heap.
	 *
	 */
	public FibonacciHeap()
	{
		this.min = null;
		this.TotalLinks = 0;
		this.Totalcuts = 0;
		this.Size = 0;
		this.NumTrees = 0;
	}

	/**
	 *
	 * pre: key > 0
	 *
	 * Insert (key,info) into the heap and return the newly generated HeapNode.
	 *
	 */
	public HeapNode insert(int key, String info)
	{
		return null; // should be replaced by student code
	}

	/**
	 *
	 * Return the minimal HeapNode, null if empty.
	 *
	 */
	public HeapNode findMin()
	{

		return this.min;
	}

	/**
	 *
	 * Delete the minimal item
	 *
	 */
	public void deleteMin()
	{
		return; // should be replaced by student code

	}

	/**
	 *
	 * pre: 0<diff<x.key
	 *
	 * Decrease the key of x by diff and fix the heap. 
	 *
	 */
	public void decreaseKey(HeapNode x, int diff)
	{
		return; // should be replaced by student code
	}

	/**
	 *
	 * Delete the x from the heap.
	 *
	 */
	public void delete(HeapNode x)
	{
		return; // should be replaced by student code
	}


	/**
	 *
	 * Return the total number of links.
	 *
	 */
	public int totalLinks()
	{

		return this.TotalLinks;
	}


	/**
	 *
	 * Return the total number of cuts.
	 *
	 */
	public int totalCuts()
	{

		return this.Totalcuts;
	}


	/**
	 *
	 * Meld the heap with heap2
	 *
	 */
	public void meld(FibonacciHeap heap2)
	{
		return; // should be replaced by student code   		
	}

	/**
	 *
	 * Return the number of elements in the heap
	 *
	 */
	public int size()
	{

		return this.Size;
	}


	/**
	 *
	 * Return the number of trees in the heap.
	 *
	 */
	public int numTrees()
	{

		return this.NumTrees;
	}

	/**
	 * Class implementing a node in a Fibonacci Heap.
	 *
	 */
	public static class HeapNode{
		public int key;
		public String info;
		public HeapNode child;
		public HeapNode next;
		public HeapNode prev;
		public HeapNode parent;
		public int rank;
		public boolean mark;
	}
}
