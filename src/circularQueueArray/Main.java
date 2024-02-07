package circularQueueArray;

public class Main {

	public static void main(String[] args) {
		Queue q=new Queue(5);
		
		q.enQueue(1); //top=0
		q.enQueue(2); //top=1
		q.enQueue(3); //top=2
		q.enQueue(4); //top=3
		q.enQueue(5); //top=4
		
		System.out.println(q.deQueue());
		q.enQueue(6);
		System.out.println(q.deQueue());
		q.enQueue(7);
		
		System.out.println(q.deQueue());
		q.enQueue(8);
		System.out.println(q.deQueue());
		q.enQueue(9);
		System.out.println(q.deQueue());
		q.enQueue(10);
		
		System.out.println(q.deQueue());
		

	}

}
