package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	Node root;
	
	public Tree() {
		this.root=null;
	}
	
//	PreOrder Traversal
	
	public void preOrder(Node node) {
		if(node==null) {
			return ;
		}
		System.out.print(node.value+" ");
		preOrder(node.left);
		preOrder(node.right);
		
	}

	
//	InOrder Traversal
	public void inOrder(Node node) {
		if(node==null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.value+" ");
		inOrder(node.right);
		
	}
	
//	PostOrder Traversal
	public void postOrder(Node node) {
		if(node==null) {
			return ;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value +" ");
	}
	
//	Level Order Traversal
	public void levelOrder() {
		Queue<Node> queue=new LinkedList<Node>();
		if(this.root.left==null && this.root.right==null) {
			this.root=null;
			System.out.println("The tree is empty");
			return;

		}else {
			queue.add(root);
			while(!queue.isEmpty()) {
				Node presentNode=queue.remove();
				System.out.print(presentNode.value+" ");
				if(presentNode.left!=null) {
					queue.add(presentNode.left);
				}
				if(presentNode.right!=null) {
					queue.add(presentNode.right);
				}
			}
		}
	}
	
	
//	Search for an element
	public void search(int num) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node presentNode=q.remove();
			if(presentNode.value==num) {
				System.out.println("The given number "+num+" is present in the tree ");
				return;
			}else {
				if(presentNode.left!=null) {
					q.add(presentNode.left);
					
				}
				if(presentNode.right!=null) {
					q.add(presentNode.right);
					
				}
			}
			
			
		}
		 
		System.out.println("The value "+num+ " is not present in the tree");
	}
	
//	Insert
	public void insert(int value) {
		Node newNode =new Node();
		newNode.value=value;
		if(this.root==null) {
			this.root=newNode;
			System.out.println("Insertted successfully at root");
			return;
		}else {
			Queue<Node> q=new LinkedList<>();
			q.add(root);

			while(!q.isEmpty()) {
				Node presentNode=q.remove();
				if(presentNode.left==null) {
					presentNode.left=newNode;
					System.out.println("Insertted successfully");
					break;

				}
				else if(presentNode.left!=null) {
					q.add(presentNode.left);

				}
				if(presentNode.right==null) {
					presentNode.right=newNode;
					System.out.println("Insertted successfully");
					break;

				}
				else if(presentNode.right!=null) {
					q.add(presentNode.right);

				}


			}
		}
	}
	
//	Delete
	
	
	private void deleteDeepestNode() {
		if(this.root.left==null && this.root.right==null) {
			this.root=null;
			System.out.println("The tree is empty");
			return;

		}else {
			Node previousNode=null,presentNode=null;

			Queue<Node> q=new LinkedList<>();
			q.add(this.root);

			while(!q.isEmpty()) {
				previousNode=presentNode;
				presentNode =q.remove();
				if(presentNode.left==null) {
					previousNode.right=null;
					return ;
				}else if(presentNode.right==null) {
					presentNode.left=null;
					return ;
				}

				q.add(presentNode.left);
				q.add(presentNode.right);

			}
		}
	}
	
	private Node getDeepestNode() {
		Node presentNode=null;
		
		Queue<Node> q=new LinkedList<>();
		q.add(this.root);
		
		while(!q.isEmpty()) {
			presentNode =q.remove();
			if(presentNode.left!=null) {
				q.add(presentNode.left);
			} 
			if(presentNode.right!=null) {
				q.add(presentNode.right);
			}

		}
		return presentNode;

		
	}
	
	
	
	
	public void delete(int value) {
		Queue<Node> q=new LinkedList<>();
		q.add(this.root);
		while(!q.isEmpty()) {
			Node presentNode=q.remove();
			if(presentNode.value==value) {
				presentNode.value=this.getDeepestNode().value;
				this.deleteDeepestNode();
				System.out.println("The node is deleted");
				return;
			}else {
				if(presentNode.left!=null) 
					q.add(presentNode.left);
				if(presentNode.right!=null) 
					q.add(presentNode.right);
			}
		}
		
		System.out.println("the node does not exits in the Tree");
		
	}
}


