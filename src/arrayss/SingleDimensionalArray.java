package arrayss;

import java.util.Arrays;

public class SingleDimensionalArray {
	String [] arr;
	
//	Constructor method
	public SingleDimensionalArray(int sizeOfArray) {
		arr=new String[sizeOfArray];
		for(int i=0;i<arr.length;i++) {
			arr[i]= null;
		}
	}
	
//	Inserting elements into an array
	public void insert(String value,int location) {
		try {
			if(arr[location]==null) {
				arr[location]=value;
				System.out.println("Successfully inserted");
			}else {
				System.out.println("This cell is already occupied");
			}
		}catch (Exception e) {
			System.out.println("Invalid index to access array");
		}
		
	}
	
	
	
//	Accessing the elements using index
	public String accessingElement(int indexOfElement) {
		try {
			if(indexOfElement>(this.arr.length-1)) {
				throw new Exception("Invalid index to access array");
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getLocalizedMessage());
			
		}
		return this.arr[indexOfElement];
		
	}
	
	
//	Displaying the entire array
	public void display() {
		System.out.println(Arrays.toString(this.arr));
	}
	
//	Traversal Array
	public void triversalArray() {
		try {
			for(int i=0;i<this.arr.length;i++) {
				if(i<(this.arr.length-1)) {
				System.out.print(this.arr[i]+",");
				}
				else {
					System.out.print(this.arr[i]);
				}
			}
		}catch(Exception e) {
			System.out.println("Arrey does not exits");
		}
		
	}
	
//	Search for Array element 
	public void searchInArray(String value) {
		for(String a:arr) {
			if(a==value) {
				System.out.println("Value is found");
				return;
			}
					}
		System.out.println("Value is not found");

	}
	

	
//	deleting Values in an array
	public void delete(int index) { 
		try {
			this.arr[index]=null;
			System.out.println("Successfully deleted");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The value that is provided is not in the range of array");
		}
		
	}

}
