package intlist;

import java.util.Arrays;

/**
 * Each instance of this class stores a sequence of int values.
 */
public class IntList {
	
	private static class Node {
		private int value;
		/**
		 * @peerObject
		 */
		private Node next;
		
		private Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	private boolean hasLength(Node n, int length) {
		return n == null && length == 0 || length > 0 && hasLength(n.next, length - 1);
	}
	
	/**
	 * @invar | hasLength(first, length)
	 * @representationObject
	 */
	private Node first;
	private int length;
	
	/**
	 * Returns an array containing this object's sequence of int values.
	 * 
	 * @post | result != null
	 * @creates | result
	 */
	public int[] getElements() {
		int[] result = new int[length];
		Node n = first;
		for (int i = 0; i < result.length; i++) {
			result[i] = n.value;
			n = n.next;
		}
		return result;
	}
	
	/**
	 * Initializes this object so that it stores the empty sequence of int values.
	 * 
	 * @post | getElements().length == 0
	 */
	public IntList() {}
	
	/**
	 * Adds the given value to the end of this object's sequence of int values.
	 * 
	 * @mutates | this
	 * 
	 * @post | getElements().length == old(getElements().length) + 1
	 * @post | getElements()[old(getElements().length)] == value
	 * @post | Arrays.equals(getElements(), 0, old(getElements().length), old(getElements()), 0, old(getElements().length))
	 */
	public void add(int value) {
		if (first == null)
			first = new Node(value, null);
		else {
			Node n = first;
			while (n.next != null)
				n = n.next;
			n.next = new Node(value, null);
		}
		length++;
	}
	
	/**
	 * Removes the last element of this object's sequence of int values and returns it.
	 * 
	 * @pre | getElements().length > 0
	 * 
	 * @mutates | this
	 * 
	 * @post | getElements().length == old(getElements().length) - 1
	 * @post | result == old(getElements())[getElements().length]
	 * @post | Arrays.equals(getElements(), 0, getElements().length, old(getElements()), 0, getElements().length)
	 */
	public int removeLast() {
		length--;
		if (first.next == null) {
			int result = first.value;
			first = null;
			return result;
		}
		Node n = first;
		while (n.next.next != null)
			n = n.next;
		int result = n.next.value;
		n.next = null;
		return result;
	}

}
