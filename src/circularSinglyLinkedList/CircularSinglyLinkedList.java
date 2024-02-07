package circularSinglyLinkedList;

public class CircularSinglyLinkedList {
	public Node head;
	public Node tail;
	public int size;
	
//	TC - O(1) SC -O(1)
	public Node createCircularSinglyLinkedList(int nodeValue) {
		Node node=new Node();
		node.value=nodeValue;
		
		node.next=node;
		head=node;
		tail=node;
		
		this.size=1;
		
		return head;
	}
	
//	Insertion 
	
	public void insert(int nodeValue, int location) {
		
		if(head==null) {
			this.createCircularSinglyLinkedList(nodeValue);
			return;
		
		}else {
			Node node=new Node();
			node.value=nodeValue;
			
			if(location==0) {
				node.next=head;
				tail.next=node;
				head=node;
			}
			else if(location>=size) {
				node.next= head;
				tail.next=node;
				tail=node;
			}else {
				int index=0;
				Node tempNode=head;
				
				while(index<location-1) {
					tempNode=tempNode.next;
					index++;
				}
				node.next=tempNode.next;
				tempNode.next=node;
			}
		}
		size++;
	}

//	Traversal
	public void display() {
		if(head==null) {
			System.out.println("The list is empty");
		}else {
			Node tempNode=head;
			for(int i=0;i<size;i++) {
				System.out.print(tempNode.value);
				if(i<size-1)
					System.out.print(" -> ");
				tempNode= tempNode.next;
			}
			System.out.println();
		}
	}
	//	Search
	public boolean serach(int searchValue) {
		if(head==null) {
			System.out.println("The list is empty");
			return false;
		}else {
			Node tempNode=head;
			for(int i=0;i<size;i++) {
				if(tempNode.value==searchValue) {
					System.out.println("The value is presnt in the location "+ (i+1));
					return true;
				}
				tempNode=tempNode.next;
			}
			System.out.println("The given value is not present in the list");
			return false;
		}
	}
	
//	Delete
	public void delete(int location) {
		if(head==null) {
			System.out.println("The list is empty");
		}else {
			if(location==0) {
				if(size==1) {
					head=tail=null;
				}else {
					head=head.next;
					tail.next=head;
				}
			}else if(location>=size) {
				Node tempNode=head;
				for(int i=0;i<size-1;i++) {
					tempNode=tempNode.next;
				}
				tempNode.next=head;
				tail=tempNode;
			}else {
				Node tempNode=head;
				for(int i=0;i<location-1;i++) {
					tempNode=tempNode.next;
				}
				tempNode.next=tempNode.next.next;
			}
			this.size--;
		}
		
	}
	
	public void delete() {
		if(head==null) {
			System.out.println("The list is empty");
		}else {
			head=null;
			tail.next=null;
			tail=null;
			size=0;
			System.out.println("The list is deleted succesfully");
		}
		
		
	}
}
