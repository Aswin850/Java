package circularSinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		
		CircularSinglyLinkedList csll=new CircularSinglyLinkedList();
		csll.createCircularSinglyLinkedList(5);
		csll.insert(4, 0);
		csll.insert(3, 1);
		csll.insert(6, 2);
		csll.insert(9, 3);


		
		csll.display();
		System.out.println(csll.size);
		
		
		csll.delete();
		csll.display();
		System.out.println(csll.size);
//		
//		System.out.println("--1--");
//		csll.delete(2);
//		csll.display();
//		System.out.println(csll.size);
//		
//		System.out.println("--2--");
//		csll.delete(2);
//		csll.display();
//		System.out.println(csll.size);
//		
//		System.out.println("--3--");
//		csll.delete(2);
//		csll.display();
//		System.out.println(csll.size);
//		
//		System.out.println("--4--");
//		csll.delete(2);
//		csll.display();
//		System.out.println(csll.size);

	}

}
