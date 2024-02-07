package linearQueueArray;

public class Queue {
	public int[] queue;
	int beginnigOfQueue ,topOfQueue;
	
	public Queue(int size) {
		queue=new int[size];
		beginnigOfQueue=-1;
		topOfQueue=-1;
		System.out.println("The queue is successful created with size "+size);
	}
	
	public void enqueue(int value) {
		if(beginnigOfQueue>topOfQueue) {
			beginnigOfQueue=-1;
			topOfQueue=-1;
		}
		if(beginnigOfQueue==-1) {
			beginnigOfQueue++;
		}
		
		if(this.topOfQueue< this.queue.length) {
		this.topOfQueue++;
		queue[topOfQueue]=value;
		}else {
			System.out.println("The queue is full");
		}
	}
	
	public int dequeue() {
		if(beginnigOfQueue<=topOfQueue) {
			int i=this.beginnigOfQueue;
			beginnigOfQueue++;
			return queue[i];
			
		}else {
			System.out.println("The queue is empty");
			return -1;
		}	
	}
	
	public int peek() {
		if(beginnigOfQueue>topOfQueue) {
			System.out.println("The queue is empty");
			return -1;
		}else {
			return queue[beginnigOfQueue];
		}
	}
	
	public boolean isFull() {
		if(topOfQueue==queue.length-1) {
			return true;
		}else 
			return false;
	}
	
	public boolean isEmpty() {
		if(topOfQueue<beginnigOfQueue ||  beginnigOfQueue == -1) {
			return true;
		}else 
			return false;
		}
	

}
