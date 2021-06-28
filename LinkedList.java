package LinkedList;

public class LinkedList<T> {
	Node<T> head;

	/**
	 * Appends the specified element to the end of this list.
	 * 
	 * @param value
	 */
	public void add(T value) {
		Node<T> newNode = new Node<T>();
		
		newNode.value = value;
		newNode.next = null;
		
		// If head is null, then create a new head.
		if (head == null) {
			head = newNode;
		} else {
			Node<T> last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}

	/**
	 * It is looping through the nodes and printing their values till the last
	 * node's next element is null
	 */
	public void show() {
		Node<T> last = head;
		while (last.next != null) {
			System.out.println(last.value);
			last = last.next;
		}
		System.out.println(last.value);
	}

}
