package doublyLinkedList;

public class DoublyLinkedList {
	public Node head,tail;
	public int size;
	
//	 Create
	public Node createDoublyLinkedList(int nodeValue) {
		Node node=new Node();
		node.value=nodeValue;
		node.previous=null;
		node.next=null;
		
		head=tail=node;
		size=1;
		
		return head;
	}
	
//	Insert
	public void insert(int nodeValue,int location) {
		if(head==null) {
			this.createDoublyLinkedList(nodeValue);
		}else {
			Node node=new Node();
			node.value=nodeValue;
			if(location==0) {
				node.next=head;
				head.previous=node;
				node.previous=null;
				
				head=node;
				
			}else if(location>=size) {
				node.next=null;
				node.previous=tail;
				tail.next=node;
				
				tail=node;
				
			}else {
				Node tempNode=head;
				for(int i=0;i<location;i++) {
					tempNode=tempNode.next;
				}
				node.next=tempNode.next;
				tempNode.next.previous=node;
				
				node.previous=tempNode;
				tempNode.next=node;
			}
			this.size++;
		}
	}
	
	
//	Traversal
	public void display(boolean d) {
		
		if(head==null) {
			System.out.println("The list is empty ");
		}else {
			if(d) {
				Node tempNode=head;
				for(int i=0;i<size;i++) {
					System.out.print(tempNode.value);
					if(i<size-1) {
						System.out.print(" -> ");
					}
					tempNode=tempNode.next;
				}
				System.out.println();
			}else {
				Node tempNode=tail;
				for(int i=0;i<size;i++) {
					System.out.print(tempNode.value);
					if(i<size-1) {
						System.out.print(" -> ");
					}
					tempNode=tempNode.previous;
				}
				System.out.println();
			}

		}
		
	}
	
//	Search
	public boolean search(int searchValue) {
		if(head==null) {
			System.out.println("The list is empty ");
			return false;
		}else {
			Node tempNode=head;
			for(int i=0;i<size;i++) {
				if(tempNode.value==searchValue) {
					System.out.println("The entred value is present in the list at the location "+i);
					return true;
				}
				tempNode=tempNode.next;
			}
			System.out.println("The entred value is not present in the list");
			return false;
		}
		
		
	}
	
//	Delete
	public void delete(int location) {
		if(head==null) {
			System.out.println("The list is empty ");
		}else {
			if(location==0) {
				if(size==1) {
					head=tail=null;
				}else {
					head=head.next;
					head.previous=null;
					
					
				}
			}else if(location>=size) {
				if(size==1) {
					head=tail=null;
				}else {
					tail=tail.previous;
					tail.next=null;
					}
			}else {
				Node tempNode=head;
				for(int i=1;i<location;i++) {
					tempNode=tempNode.next;
				}
				tempNode.next=tempNode.next.next;
				tempNode.next.previous=tempNode;
				
			}
			size--;
		}
	}
	
	public void delete() {
		Node tempNode=head;
		for(int i=0;i<size;i++) {
			tempNode.previous=null;
			tempNode=tempNode.next;
		}
		
		head=null;
		tail=null;
		size=0;
	}

}
