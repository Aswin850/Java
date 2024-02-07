package stackUsingLinkedList;

public class Main {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.createStack(1);
		
		s.puch(2);
		s.puch(3);
		s.puch(4);
		s.puch(5);
		s.puch(6);
	
		System.out.println(s.peak());
	}

}
