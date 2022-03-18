package intlist;

import java.util.Arrays;

/**
 * Each instance of this class stores a sequence of int values.
 */
public class IntList {
	
	/**
	 * Returns an array containing this object's sequence of int values.
	 * 
	 * @post | result != null
	 * @creates | result
	 */
	public int[] getElements() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * Initializes this object so that it stores the empty sequence of int values.
	 * 
	 * @post | getElements().length == 0
	 */
	public IntList() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * Adds the given value to the end of this object's sequence of int values.
	 * 
	 * @post | getElements().length == old(getElements().length) + 1
	 * @post | getElements()[old(getElements().length)] == value
	 * @post | Arrays.equals(getElements(), 0, old(getElements().length), old(getElements()), 0, old(getElements().length))
	 */
	public void add(int value) { throw new RuntimeException("Not yet implemented"); }

}
