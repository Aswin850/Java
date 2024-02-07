package stackUsingLinkedList;

public class Stack {
	
	public Node head;
	public Node tail;
	public int size;
	
//	Create a Stack
	public Node createStack(int nodeValue) {
		Node node=new Node();
		node.value=nodeValue;
		node.next=null;
		
		head=node;
		tail=node;
		size=1;
		return head;
	}
	
//	Adds elements to the last
	public void puch(int nodeValue) {
		if(head==null) {
			this.createStack(nodeValue);
		}else {
			Node node=new Node();
			node.value=nodeValue;
			node.next=null;
			tail=node;
			
			if(size==1) {
				head.next=node;	
				
			}else {
				
				Node tempNode=head;
				for(int i=1;i<size;i++) {
					tempNode=tempNode.next;
				}
				tempNode.next=node;
			}
			
			size++;
			
		}
	}
//	Remove last element form the stack
	public int pop() {
		if(head==null) {
			System.out.println("The Stack is empty");
			return 0;
		}else {
			if(size==1) {
				int res=head.value;
				head=tail=null;
				size--;
				return res;
			}else {
				Node tempNode=head;
				for(int i=1;i<size-1;i++) {
					tempNode=tempNode.next;
				}
				int res=tempNode.next.value;
				tempNode.next=null;
				tail=tempNode;
				size--;
				return res;
			}
			
			
		}
		
		
	}
	
//	Returns the last element of the stack
	public int peak() {
		if(head==null) {
			System.out.println("The Stack is empty");
			return 0;
		}else {
			return tail.value;
		}
	}
	
//	Delete the Stack
	
	public void delete() {
		if(head==null) {
			System.out.println("The Stack is empty");
		}else {
			head=tail=null;
		}
	}

}
