package stackUsingArray;

public class Stack {
	public int[] stack;
	int topOfStack;
	
	public Stack(int size) {
		this.stack= new int[size];
	
		topOfStack=-1;
		System.out.println("The stack is created with size of: "+size);
	}
	
	public boolean isEmpty() {
		if(topOfStack==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(topOfStack==stack.length-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int value) {
		if(topOfStack<stack.length-1) {
		this.topOfStack=topOfStack+1;
		stack[topOfStack]=value;
		}else {
			System.out.println("The stack is full");
		}
		
	}
	
	public int peek() {
		if(topOfStack==-1) {
			System.out.println("The stack is empty");
			return -1;
		}else
		 return this.stack[topOfStack];
	}
	
	public int pop() {
		int top=topOfStack;
		this.topOfStack=topOfStack-1;
		if(top==-1) {
			System.out.println("The stack is empty");
			return -1;
		}else
		 return stack[top];
	}
	
	public void delete() {
		this.stack=null;
		this.topOfStack=-1;
		System.out.println("The stack is successfully deleted");
	}
	

}
