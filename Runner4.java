package LinkedList;

public class Runner4 {
	public static void main(String[] args) {
		UC4Linklist<Integer> numberList = new UC4Linklist<Integer>();
		numberList.add(56);
		numberList.add(70);
		numberList.addAtIndex(30, 1);
		numberList.show();
	}
}
