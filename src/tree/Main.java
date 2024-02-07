package tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t=new Tree();
		
		t.insert(1);
		t.insert(2);
		t.insert(3);
		t.insert(4);
		t.insert(5);
		t.insert(6);
		
		t.delete(3);
		
		t.levelOrder();
	}
	
	

}
