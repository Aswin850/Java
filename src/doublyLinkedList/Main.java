package doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll=new DoublyLinkedList();
		
		dll.createDoublyLinkedList(1);
		dll.insert(2, 1);
		dll.insert(3, 2);
		dll.insert(4, 3);
		dll.insert(5, 4);
		
//		dll.delete(0);
		dll.display(true);
		System.out.println(dll.size);
		
		dll.delete();
		dll.display(true);
		System.out.println(dll.size);
	}

}
