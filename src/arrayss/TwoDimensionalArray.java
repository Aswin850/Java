package arrayss;

import java.util.Arrays;

public class TwoDimensionalArray {
	
	private int [][] arr;
	private int index1,index2;
	
//	Constructor Method
	public TwoDimensionalArray(int index1,int index2) {
		this.index1=index1;
		this.index2=index2;
		arr = new int[index1][index2];
		for(int i=0;i<index1;i++) {
			for(int j=0;j<index2;j++) {
				arr[i][j]=Integer.MIN_VALUE;
			}
		}
	}
	
//	Insert into to array
	public void insert(int index1,int index2,int value) {
		try {
			if(arr[index1][index2]==Integer.MIN_VALUE) {
				this.arr[index1][index2]=value;
				System.out.println("Successfully inserted");
			}
			else {
				System.out.println("This cell is already occupied");
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array");
			
		}


	}
	
//	Accessing element of an array
	public void accessingElements(int i,int j) {
		try {
			System.out.println(this.arr[i][j]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array");
		}

	}
	
//	Traverse through the array
	public void traverseArray() {
		for(int i=0;i<this.index1;i++) {
			for(int j=0;j<this.index2;j++) {
				System.out.print(this.arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	
//	Search for Array element
	public void search(int value) {
		for(int i=0;i<this.index1;i++) {
			for(int j=0;j<this.index2;j++) {
				if(this.arr[i][j]==value) {
					System.out.println("The "+value+" is found in the index ["+i+","+j+"]");
					return;
				}
			}
		}
		System.out.println("Value not found");
	}
	
//	Displaying the entire array
	public void display() {
		for(int i=0;i<this.index1;i++) {
			System.out.println(Arrays.toString(this.arr[i]));
		}
		
	}

}
