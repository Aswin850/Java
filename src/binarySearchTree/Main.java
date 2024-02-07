package binarySearchTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTS bts =new BTS();
		
		bts.insert(70);;
		bts.insert(50);
		bts.insert(90);
		bts.insert(30);
		bts.insert(60);
		bts.insert(80);
		bts.insert(100);
		bts.insert(20);
		bts.insert(40);
		bts.insert(10);
		bts.insert(95);
		
		System.out.println("In-Order");
		bts.inOrder(bts.root);
		System.out.println();
		
		System.out.println();
		System.out.println("Pre-Order");
		bts.preOrder(bts.root);
		System.out.println();
		
		System.out.println();
		System.out.println("Post-Order");
		bts.postOrder(bts.root);
		System.out.println();
		
		System.out.println();
		System.out.println("Level-Order");
		bts.levelOrder();
		System.out.println();
		
		
		System.out.println();
		bts.search(40);
		
		bts.delete(70);
		System.out.println("Level-Order");
		bts.levelOrder();
		System.out.println();
		
		bts.delete(100);
		System.out.println("Level-Order");
		bts.levelOrder();
		System.out.println();
		
		
		System.out.println();
		bts.delete();
		bts.levelOrder();
		

	}

}
