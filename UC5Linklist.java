package LinkedList;

public class UC5Linklist<T> {
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
		
		// If head is null, create a new head.
		if (head == null) {
			head = newNode;
		} else {
			Node<T> currNode = head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}
	}

	/**
	 * It is looping through the nodes and printing their values till the last
	 * node's next element is null
	 */
	public void show() {
		Node<T> currNode = head;
		while (currNode.next != null) {
			System.out.println(currNode.value);
			currNode = currNode.next;
		}
		System.out.println(currNode.value);
	}

	/**
	 * Inserts the specified element at the start of the list.
	 * 
	 * @param value
	 */
	public void addAtStart(T value) {
		Node<T> newNode = new Node<>();
		newNode.value = value;
		newNode.next = head;
		head = newNode;
	}

	/**
	 * Inserts the specified element at the specified position in this list
	 * 
	 * @param value
	 * @param index
	 */
	public void addAtIndex(T value, int index) {
		if (index == 0) {
			addAtStart(value);
		} else {
			Node<T> newNode = new Node<>();
			newNode.value = value;
			Node<T> nodeAtPreviousIndex = head;
			for (int i = 0; i < index - 1; i++) {
				nodeAtPreviousIndex = nodeAtPreviousIndex.next;
			}
			newNode.next = nodeAtPreviousIndex.next;
			nodeAtPreviousIndex.next = newNode;
		}
	}

	/**
	 * Removes the first element from this list, if it is present
	 */
	public void pop() {
		if (null != head) {
			Node<T> newHead = head.next;
			head = newHead;
		}
	}

}
