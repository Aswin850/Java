package linkedList.SinglyLinkedlist;

public class Main {

	public static void main(String[] args) {
		
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.createSinglyLinkedList(5);
		sll.insert(6,0);
		sll.insert(10, 2);
		sll.insert(15, 1);
		sll.insert(11, 3);
		sll.insert(23, 4);
		sll.insert(5, 5);
		sll.insert(9, 0);
		
		System.out.println(sll.size);
		sll.traversal();
		
		sll.delete();
		System.out.println(sll.size);
		sll.traversal();
		
		
		
		
	}

}
