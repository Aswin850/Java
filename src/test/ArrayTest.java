package test;

import java.util.Arrays;

public class ArrayTest {
	public String maxProduct(int[] intArray) {
        // TODO
		Arrays.sort(intArray);
		int [] maxPro=new int[2];
		int largest=Integer.MIN_VALUE;
		for(int i=0;i < intArray.length-1;i++) {
			int prod=intArray[i]*intArray[i+1];
			if(prod > largest ) {
				largest=prod;
				maxPro[0]=intArray[i];
				maxPro[1]=intArray[i+1];
				
			}
		}
		
		return Arrays.toString(maxPro);
    }
	
	
	

}
