package LinkedList;

public class Runner7 {
	public static void main(String[] args) {
		UC7Linklist<Integer> numberList = new UC7Linklist<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(70);
		System.out.println("Linked list elements");
		numberList.show();
		System.out.println();
		int searchResult = numberList.searchByValue(90);
		String result = (searchResult == -1) ? "value not found in the list" : "value found at index " + searchResult;
		System.out.println(result);
	}
}
