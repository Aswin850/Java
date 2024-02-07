package binaryHeap;

public class BinaryHeap {
	private Integer [] arr;
	private int sizeOfHeap;
	
	
	public BinaryHeap(int size) {
		arr=new Integer[size+1];
		this.sizeOfHeap=0;
		System.out.println("Binary Heap has beem created");
		
	}
	
//	 returns true if the binary heap is empty
	public boolean isEmpty() {
		if(this.sizeOfHeap==0)
			return true;
		return false;
	}
	
// Returns the root of the binary heap
	public Integer peek() {
		if(isEmpty()) {
			System.out.println("Binary Heap is empty");
			return null;
		}else
			return arr[1];
	}
	
//	size of the Binary heap
	public int sizeOfBH() {
		return this.sizeOfHeap;
	}
	
	
//	Traversal 
	public void levelOrder() {
		for(int i=1;i<=this.sizeOfHeap;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println('\n');
	}
	
	
//	insert
	/*
	 * First find the first vacant place in the tree
	 * Check whether the newly inserted value satisfy the heap property */
	
//	Heapify for insert
	public void heapifyBottomToTop(int index,String heapType) {
		int parent=  (int) Math.ceil(index/2);
		if(index<=1) {
			return;
		}
		if(heapType.equalsIgnoreCase("min")) {
			if(arr[index]<arr[parent]) {
				int temp=arr[index];
				arr[index]=arr[parent];
				arr[parent]=temp;
			}
			
		}else if(heapType.equalsIgnoreCase("max")) {
			if(arr[index]>arr[parent]) {
				int temp=arr[index];
				arr[index]=arr[parent];
				arr[parent]=arr[index];
			}
		}
		this.heapifyBottomToTop(parent, heapType);
	}
	
	
	public void insert(int value,String typeHeap) {
		arr[sizeOfHeap+1]=value;
		sizeOfHeap++;
		heapifyBottomToTop(sizeOfHeap, typeHeap);
		System.out.println("Value: "+value+" successfully inserted");
	}
	
//	extract
//	miniumValue
	private int minNodeValue(int left,int right) {
		if(arr[left]<arr[right]) {
			return left;
		}else {
			return right;
		}
	}
	
//	maxiumValue
	private int maxNodeValue(int left,int right) {
		if(arr[left]>arr[right]) {
			return left;
		}else {
			return right;
		}
	}
	
//	heapify for extract
	private void heapifyTopToBottom(int index,String heapType) {
		int swapChildIndex=0;
		int left=index*2;
		int right=(index*2)+1;
		if(left>this.sizeOfHeap) {
			return ;
		}
		if(heapType.equalsIgnoreCase("min")) {
			if(sizeOfHeap==left) {
				if(arr[index]>arr[left]) {
					int temp= arr[left];
					arr[left]=arr[index];
					arr[index]=temp;
				}
				return;
			}else {
				if(arr[left]<arr[right]) {
					swapChildIndex=left;
				}else {
					swapChildIndex=right;
				}
				if(arr[index]>arr[swapChildIndex]) {
					int temp= arr[swapChildIndex];
					arr[swapChildIndex]=arr[index];
					arr[index]=temp;
				}
		}
		}else if(heapType.equalsIgnoreCase("max")) {
			if(left==this.sizeOfHeap) {
				if(arr[index]<arr[left]) {
					int temp= arr[left];
					arr[left]=arr[index];
					arr[index]=temp;
				}
			}else {
				if(arr[left]>arr[right]) {
					swapChildIndex=left;
				}else {
					swapChildIndex=right;
				}
				if(arr[index]<arr[swapChildIndex]) {
					int temp= arr[swapChildIndex];
					arr[swapChildIndex]=arr[index];
					arr[index]=temp;
				}
			}
			
			
		}
		this.heapifyTopToBottom(swapChildIndex, heapType);
		
	}
	
	public int extract(String heapType) {
		if(isEmpty()) {
			return -1;
		}
		int extractedValue=arr[1];
		arr[1]=arr[this.sizeOfHeap];
		arr[this.sizeOfHeap]=null;
		sizeOfHeap--;
		this.heapifyTopToBottom(1, heapType);
	
		System.out.println(extractedValue);
		return extractedValue;
		
	}
}
