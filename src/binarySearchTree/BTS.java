package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BTS {
	public Node root;
	
	public BTS() {
		this.root=null;
	}
	
	public Node insertLocation(Node node,int value) {
		if(node.value>=value) {
			if(node.left==null)
				return node;
			node=insertLocation(node.left, value);
		}else {
			if(node.right==null)
				return node;
			node=insertLocation(node.right, value);
		}
		return node;

	}
	
	public void insert(int value) {
		Node node=new Node();
		node.value=value;
		if(this.root==null) {
			this.root=node;
		}else {
			Node targetNode=this.insertLocation(root, value);
			if(targetNode.value>=value) {
				targetNode.left=node;
				
			}else {
				targetNode.right=node;
			}
			
			
		}
	}
	
	
//	inOrder Traversal
	public void inOrder(Node node) {
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.value +" ");
		inOrder(node.right);
	
	}

//	preOrder Traversal
	public void preOrder(Node node) {
		if(node==null) {
			return ;
		}
		System.out.print(node.value +" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
//	postOrder Traversal
	public void postOrder(Node node) {
		if(node==null) {
			return ;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value +" ");
	}
	
//	LevelOrder Traversal
	public void levelOrder() {
		if(this.root==null) {
			System.out.println("The BST is empty");
			return;
		}
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
	private Node search(Node currentNode,int value) {
		if(currentNode==null) {
			System.out.println("Value: "+value+" is not found in BST");
			return null;
		}
		else if(currentNode.value==value) {
			System.out.println("Value: "+value+" is  found in BST");
			return currentNode;
		}else if(currentNode.value>=value) {
			return search(currentNode.left, value);
		}else {
			return search(currentNode.right, value);

		}
//		
	}
	
	public void search(int value) {
		this.search(root, value);
	}
	
	
//	delete
	private Node minimumNode(Node node) {
		if(node.left==null) {
			return node;
		}else {
			return minimumNode(node.left);
			
		}
	}
	
	private Node delete(Node node,int value) {
		if(node==null) {
			System.out.println("Value: "+value+" is not found in BST");
			return node;
		}else if(node.value>value) {
			node.left=this.delete(node.left, value);
		}else if(node.value<value) {
			node.right=this.delete(node.right, value);
		}else {
			if(node.left!=null && node.right!=null) {
				Node temp=node;
				Node minFromRight=this.minimumNode(temp.right);
				node.value=minFromRight.value;
				node.right=delete(node.right, node.value);
			}else if(node.left !=null) {
				node=node.left;
			}else if(node.right!=null) {
				node=node.right;
			}else {
				node=null;
			}
		}
		return node;
	}
	
	public void delete(int value) {
		this.delete(root,value);
	}

//	delete the BST
	public void delete() {
		this.root=null;
	}
	

}
