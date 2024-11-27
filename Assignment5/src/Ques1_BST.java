
public class Ques1_BST {
	
	class Node{
		int data;
		Node left,right;
		
		public Node(int value) {
			data=value;
			left=right=null;
		}
	}
	private Node root;
	public Ques1_BST() {
		root=null;
	}
	private void addNode(Node trav,int value) {
		if(value < trav.data) {
			if(trav.left==null) {
				trav.left=new Node(value);
			}else {
				addNode(trav.left,value);
			}
		}else {
			if(trav.right==null) {
				trav.right=new Node(value);
			}else {
				addNode(trav.right, value);
			}
		}
	}
	public void addNode(int value) {
		if(root == null) {
			root= new Node(value);
		}else {
			addNode(root,value);
		}
	}
	private  void inOrder(Node trav) {
		if(trav == null) {
			return;
		}
		inOrder(trav.left);
		System.out.println(" "+trav.data);
		inOrder(trav.right);
	}
	public void inOrder() {
		inOrder(root);
	}
	public Node binarySearch(int key,Node trav) {
		if(trav==null) {
			return null;
		}
		if(key == trav.data) {
			return trav;
		}
		if(key <trav.data) {
		     	return binarySearch(key, trav.left);
		}else{
			return binarySearch(key, trav.right);
		}
		
	}
    public Node binarySearch(int value) {
    	return binarySearch(value, root);
    	
    }
	public static void main(String[] args) {
		Ques1_BST bst= new Ques1_BST();
		bst.addNode(8);
		bst.addNode(9);
		bst.addNode(5);
		bst.addNode(3);
		bst.addNode(10);
		bst.inOrder();
        bst.binarySearch(8);	
	}

}
