package binaryHeap;

public class Main {

	public static void main(String[] args) {
		BinaryHeap bp=new BinaryHeap(10); //TC- O(1) SC- O(N)
		bp.peek(); // TC-O(1) SC- O(1)
		System.out.println(bp.sizeOfBH());
		
		bp.levelOrder();// TC-O(N) SC- O(1)
		
		bp.insert(5, "min");
		bp.insert(10, "min");
		bp.insert(20, "min");
		bp.insert(30, "min");
		bp.insert(40, "min");
		bp.insert(50, "min");
		bp.insert(60, "min");
		bp.insert(80, "min");
		
		bp.levelOrder();
		
		bp.extract("min");
		bp.extract("min");
		bp.extract("min");
		bp.extract("min");
		bp.extract("min");
		bp.extract("min");
		bp.extract("min");
		bp.extract("min");
		System.out.println(bp.extract("min"));
	}

}
