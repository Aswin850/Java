package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CreatingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums= new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			nums.add(i,i*10);
		
		}
		nums.add(0, -10);
//		for loop - O(N), Space-O(1)
//		for(int i=0;i<num.size();i++) {
//			System.out.println(num.get(i));
//		}
		
		
//		for each loop- O(N) ,Space O(1)
//		for(int num :nums) {
//			System.out.println(num);
//		}
		
//		Interrater
//		Iterator<Integer> it= nums.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

//		System.out.println(nums.indexOf(-10));
		nums.remove(5);
		

		
		
		System.out.println(nums.size());
		System.out.println(nums);
		
		
		
		ArrayList<Integer> num2=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		System.out.println(num2);
		
	}

}
