package avlTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVL avl=new AVL();
		avl.insert(5);
		avl.insert(10);
		avl.insert(15);
		avl.insert(20);
		
		avl.delete(5);
		
	

		avl.levelOrder();
		System.out.println();
		
		avl.preOder(avl.root);
		System.out.println();
		
		avl.inOrder(avl.root);
		System.out.println();
		
		avl.postOrder(avl.root);
		System.out.println();
	}

}
