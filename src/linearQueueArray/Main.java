package linearQueueArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		
		
		q.enqueue(1);
		q.enqueue(2);
		
		
		System.out.println("First element is");
		System.out.println(q.peek());

	}

}
