package circularQueueArray;

public class Queue {
	int [] queue;
	int topOfQueue;
	int beginingOfQueue;
	
	public Queue(int size) {
		queue=new int[size];
		this.beginingOfQueue=this.topOfQueue=-1;
		
	}
	
	public void enQueue(int value) {
		if(beginingOfQueue>=queue.length) {
			beginingOfQueue=-1;
		}
		if(topOfQueue==queue.length-1 && beginingOfQueue!=0) {
			topOfQueue=-1;
		}
		if(beginingOfQueue==-1) {
			this.beginingOfQueue=0;
		}
		if(this.topOfQueue< this.queue.length-1)  {
			this.topOfQueue++;
			queue[topOfQueue]=value;
		}else {
			System.out.println("The queue is full");
		}
	}
	
	public int deQueue() {
		if(beginingOfQueue<queue.length) {
			int i=beginingOfQueue;
			beginingOfQueue++;
			return queue[i];
			
		}else {
			System.out.println("The queue is empty");
		}
		return 1;
	}

}
