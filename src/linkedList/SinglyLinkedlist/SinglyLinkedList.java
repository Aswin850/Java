package linkedList.SinglyLinkedlist;import java.time.LocalDate;

public class SinglyLinkedList {
	public Node head;
	public Node tail;
	
	public int size;
	
//	Time complexity O(1)
//	Space compexity O(1)
	public Node createSinglyLinkedList(int nodeValue) {
		Node node =new Node();
		node.value=nodeValue;
		node.next=null;
		
		head=new Node();
		tail=new Node();
		
		head=node;
		tail=node;
		
		return head;
		
		
	}
	
//	Insertion to the list;
	
	/*
	 * There are 3 ways to enter elements into a linked list
	 * 1) at the beginning TC-> O(1) SC->O(1)
	 * 2)at the end        TC-> O(1) SC->O(1)
	 * 3) in the middle    TC-> O(N) SC->O(1) */ 
	
	public void insert(int nodeValue,int loactioin) {
		Node node=new Node();
		node.value=nodeValue;
		
		if(head==null) {
			 this.createSinglyLinkedList(nodeValue);
			 return;
			
		}
		
		if(loactioin==0) {
			node.next=head;
			head=node;
		}
		else if(loactioin>=size) {
			
			node.next=null;
			tail.next=node;
			tail=node;
			
		}
		else {
			Node tempNode=head;
			int index=0;
			while(index<loactioin-1) {
				tempNode=tempNode.next;
				index++;
			}
			
			node.next=tempNode.next;
			tempNode.next=node;
		}
		
		this.size++;
		
	}
	
	
// Traversal of Singly linked list
//	TC- O(N) SC -O(1);
	public void traversal() {
		if(head==null) {
			System.out.println("The list is empty");
		}else {
			Node tempNode=head;
			int index=0;
			while(index < this.size) {
				System.out.print(tempNode.value);
				if(index!=size-1)
					System.out.print(" -> ");
				tempNode=tempNode.next;
				index++;
			}
			System.out.println();
		}
	}

	//	Search in Singly Linked List
//	TC-O(N) and SC- O(1)

	public void search(int searchValue) {
		
		if(head==null) {
			System.out.println("The list is empty");
		}else {
			boolean flag=false;
			Node tempNode=head;
			int index=0;
			while(index < this.size) {
				if(tempNode.value==searchValue) {
					System.out.println("Yes");
					flag=true;
					break;
				}
				tempNode=tempNode.next;
				index++;
			}
			
			if(!flag) {
				System.out.println("No");
			}
			
		}
	}
	
//	 Deletion of element form singly linked list
//	1) at the beginning  TC -O(1) SC- O(1)
//	2)at the end         TC -O(N) SC- O(1)
//	3) in the middle     TC -O(N) SC- O(1)
	
	public void delete(int location) {
		if(head==null) {
			System.out.println("List is empty");
		}else if(location==0) {
			if(this.size==1) {
				head=tail=null;
			}else {
				head=head.next;
			}

		}else if(location>=this.size) {
			if(this.size==1) {
				head=tail=null;
			}else {
				int index=0;
				Node tempNode= head;
				while(index<size) {
					tempNode=tempNode.next;
					index++;
				}
				tempNode.next=null;
				tail.next=tempNode;
				
			}

		}else {
			int index=0;
			Node tempNode= head;
			while(index<location-1) {
				tempNode=tempNode.next;
				index++;
			}
			tempNode.next=tempNode.next.next;
			
		}
		this.size--;
	}
	
//	Delete entire Singly linked list
	public void delete() {
		this.head=this.tail=null;
		this.size=0;
		
	}
	
}
