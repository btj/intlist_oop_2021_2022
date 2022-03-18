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
	 * @mutates | this
	 * 
	 * @post | getElements().length == old(getElements().length) + 1
	 * @post | getElements()[old(getElements().length)] == value
	 * @post | Arrays.equals(getElements(), 0, old(getElements().length), old(getElements()), 0, old(getElements().length))
	 */
	public void add(int value) { throw new RuntimeException("Not yet implemented"); }
	
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
	public int removeLast() { throw new RuntimeException("Not yet implemented"); }

}
