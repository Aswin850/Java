package recursion;

public class SumOfNumbers {
	
	public static int sumOfNumbers(int n) {
		if(n==1) {
			return 1;
		}else
			return n + sumOfNumbers(n-1);
	}
	
	public static int power(int n) {
		if(n==0) {
			return 1;
		}else {
			return 2*power(n-1);
		}
	}
	
	public static int factorial(int n) {
		if(n<0) {
			return -1;
		}
		if(n==0 || n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	
//	Fibonacci-the sequence of numbers in which each number 
//	in the sequence is equal to the sum of two numbers 
//	before it
	
	public static int fibonacci(int n) {
		if(n<0) {
			return -1;
		}
		if(n==0 || n==1) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);

	}
	
	public static int findMax(int[] arr,int size) {
		if(size==1) {
			return arr[0];
		}
		return Integer.max(arr[size-1],findMax(arr, size-1) );
	}

}
