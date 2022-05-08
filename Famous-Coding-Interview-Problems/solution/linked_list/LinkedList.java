package solution.linked_list;

public class LinkedList {

	private Node head;
	private static int size;

	private static class Node {

		private final Object data;
		private Node next;

		Node(Object data) {
			this.data = data;
		}

		Object getData() {
			return data;
		}

		Node getNext() {
			return next;
		}

		void setNext(Node next) {
			this.next = next;
		}
	}

	public LinkedList() {
		size = 0;
	}

	public void insert(Object data) {
		if (head == null)
			head = new Node(data);

		Node temp = new Node(data);
		Node current = head;

		while (current.getNext() != null)
			current = current.getNext();

		current.setNext(temp);

		size++;
	}

	public boolean remove() {
		if (size == 0)
			return false;

		Node current = head;

		while (current.getNext().getNext() != null)
			current = current.getNext();

		current.setNext(null);
		size--;

		return true;
	}

	public Object get(int index) {
		if (index > size - 1 || index < 0)
			return null;

		Node current = head;

		for (int i = 0; i <= index; i++)
			current = current.getNext();

		return current.getData();
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("[");

		if (head != null) {
			Node current = head.getNext();

			while (current != null) {
				output
						.append("[")
						.append(current.getData().toString())
						.append("]");
				current = current.getNext();
			}
		}

		output.append("]");

		return output.toString();
	}
}