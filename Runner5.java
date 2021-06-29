package LinkedList;

public class Runner5 {
	public static void main(String[] args) {
		UC5Linklist<Integer> numberList = new UC5Linklist<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(70);
		System.out.println("Array before pop");
		numberList.show();
		System.out.println();
		numberList.pop();
		System.out.println("Array after pop");
		numberList.show();
	}

}
