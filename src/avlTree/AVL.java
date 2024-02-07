package avlTree;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {
	public Node root;
	
//	constructor
	public AVL() {
		this.root=null; 
	}
	
//	preOrder
	public void preOder(Node node) {
		if(node==null) {
			return ;
		}
		System.out.print(node.value+" ");
		preOder(node.left);
		preOder(node.right);
	}
	
//	inOrder
	public void inOrder(Node node) {
		if(node==null) {
			return ;
		}
		inOrder(node.left);
		System.out.print(node.value+" ");
		inOrder(node.right);
	}

//	postOrder
	public void postOrder(Node node) {
		if(node==null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value+" ");
	}
	
//	levelOrder
	public void levelOrder() {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node presentNode=q.remove();
			System.out.print(presentNode.value+" ");
			if(presentNode.left!=null) {
				q.add(presentNode.left);
			}
			if(presentNode.right!=null) {
				q.add(presentNode.right);
			}
		}

	}
	
//	search
	public void search(Node currentNode,int value) {
		if(currentNode == null) {
			System.out.println("The value: "+value+" is not present in the tree");
			
		}else if(currentNode.value==value) {
			System.out.println("The value: "+value+" is present in the tree");;
		}else {
			if(currentNode.value>=value) {
				search(currentNode.left, value);
			}else {
				search(currentNode.right, value);
			}
		}
		
	}
//	rotate
	
//	getHeight
	public int getHeight(Node node) {
		if(node==null)
			return 0;
		else {
			return node.height;
		}
	}
	
//	getBalance
	public int getBalance(Node node) {
		if(node==null)
			return 0;
		return getHeight(node.left)-getHeight(node.right);
	}

// leftRotate	
	public Node leftRotate(Node disbalancedNode) {
		Node newRoot=disbalancedNode.right;
		disbalancedNode.right=disbalancedNode.right.left;
		newRoot.left=disbalancedNode;
		
		disbalancedNode.height=1+ Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
		newRoot.height=1+ Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
		
		return newRoot;
	}
	
//	rightRotate
	public Node rightRotate(Node disbalancedNode) {
	  Node newRoot=disbalancedNode.left;
	  disbalancedNode.left=disbalancedNode.left.right;
	  newRoot.right=disbalancedNode;
	  
	  disbalancedNode.height=1+ Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
	  newRoot.height=1+ Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
	  
	  return newRoot;
	  
		
	}
	

	
	//	insert
	private Node insert(Node node, int value) {

		if(node==null) {
			Node newNode=new Node();
			newNode.value=value;
			newNode.height=1;
			return newNode;
		}else if(node.value>=value) {
			node.left=insert(node.left, value);

		}
		else  {
			node.right=insert(node.right, value);
		}
		
		node.height=1+Math.max(getHeight(node.left), getHeight(node.right));
		int balance=getBalance(node);
		
		if(balance>1 && value < node.left.value) {
			return rightRotate(node);
		}
		
		if(balance>1 && value > node.left.value) {
			node.left=leftRotate(node.left);
			return rightRotate(node);
		}
		
		if(balance <-1 && value >node.right.value) {
			return leftRotate(node);
			
		}
		if(balance <-1 && value< node.right.value) {
			node.right=rightRotate(node.right);
			return leftRotate(node);
		}
		return node;
	}


	public void insert(int value) {
		this.root=this.insert(root, value);
	}
	
	
	
//	delete
	
//	miniumNode
	public Node miniumNode(Node node) {
		if(node.left==null) {
			return node;
		}
		return miniumNode(node.left);

	}
	
	private Node delete(Node node,int value) {
		if(node==null) {
			System.out.println("The value: "+ value+" is not found in the tree");
			return node;
		}else if(node.value > value) {
			node.left= delete(node.left, value);
		}else if(node.value < value) {
			node.right= delete(node.right, value);
		}else {
			if(node.left!=null && node.right!=null) {
				Node tempNode=node;
				Node minFromRight=miniumNode(tempNode.right);
				node.value=minFromRight.value;
				node.right=delete(node.right, node.value);
			}
			else if(node.left!=null) {
				node.left=null;
				
			}else if(node.right!=null) {
				node.right=null;
				
			}else {
				node=null;
			}
		}
		
		int balance=getBalance(node);
		if(balance>1 && getBalance(node.left)>=0) {
			return rightRotate(node);
		} 
		if(balance >1 && getBalance(node.left)<0) {
			node.left=leftRotate(node.left);
			return rightRotate(node);
		}
		if(balance<-1 && getBalance(node.right)<=0) {
			return leftRotate(node);
		}
		if(balance<-1 && getBalance(node.right)>0) {
			return rightRotate(node);
		}
		
		return node;
		
	}
	
	public void delete(int value) {
		root=this.delete(root, value);
	}
	
}
