package solution.linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

	private static LinkedList linkedList;

	@BeforeEach
	public void setup() {
		linkedList = new LinkedList();
		linkedList.insert(4);
		linkedList.insert(-2);
		System.out.println("Setup complete");
	}

	@DisplayName("Test 1: Add")
	@Test
	public void shouldInsertTest() {
		Assertions.assertEquals(2, linkedList.size());
		linkedList.insert(2);
		Assertions.assertEquals(3, linkedList.size());
		System.out.println(linkedList.toString());
		linkedList.insert(34);
		linkedList.insert(78);
		Assertions.assertEquals(5, linkedList.size());
		System.out.println(linkedList.toString());
	}

	@DisplayName("Test 2: Remove")
	@Test
	public void shouldRemoveTest() {
		linkedList.remove();
		Assertions.assertEquals(1, linkedList.size());
		System.out.println(linkedList.toString());
		linkedList.remove();
		Assertions.assertEquals(0, linkedList.size());
		System.out.println(linkedList.toString());
		linkedList.remove();
		Assertions.assertEquals(0, linkedList.size());
		System.out.println(linkedList.toString());
	}

	@DisplayName("Test 3: Get")
	@Test
	public void shouldGetTest() {
		System.out.println(linkedList.toString());
		Assertions.assertNull(linkedList.get(-1));
		Assertions.assertEquals(4, linkedList.get(0));
		Assertions.assertEquals(-2, linkedList.get(1));
		Assertions.assertNull(linkedList.get(2));
	}
}