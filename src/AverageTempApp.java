import java.util.Arrays;

public class AverageTempApp {
	private float []arr;
	private int size;
	
//	constructor function
	public AverageTempApp(int sizeOfArray) {
		this.size=sizeOfArray;
		this.arr=new float[this.size];
	}
	
//	insert values into an array
	
	public void insert(int index,float value) {
		this.arr[index]=value;
	}
	
//	Display average
	public void displayAverage() {
		float average,sum=0;
		
		for(int i=0;i<this.arr.length;i++) {
			sum+=this.arr[i];
			
		}
		
		average=sum/this.arr.length;
		System.out.println("The average tempature for "+this.arr.length  +" days is "+average);
	}
	
// Display the array
	public void display() {
		System.out.println(Arrays.toString(this.arr));
	}
}
