package intlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntListTest {

	@Test
	void test() {
		IntList myIntList = new IntList();
		assertArrayEquals(new int[0], myIntList.getElements());
		
		myIntList.add(42);
		assertArrayEquals(new int[] {42}, myIntList.getElements());

		myIntList.add(63);
		assertArrayEquals(new int[] {42, 63}, myIntList.getElements());
		
		int result = myIntList.removeLast();
		assertEquals(63, result);
		assertArrayEquals(new int[] {42}, myIntList.getElements());
		
		assertEquals(42, myIntList.removeLast());
		assertArrayEquals(new int[0], myIntList.getElements());
	}

}
