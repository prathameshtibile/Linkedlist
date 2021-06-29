package LinkedList;

public class UC3Linklist <T>{
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
}
