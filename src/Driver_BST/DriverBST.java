package Driver_BST;

import java.util.HashSet;

public class DriverBST {
	
	static class Node{
		
		int nodeData;
		Node leftNode, rightNode;
	};
	
	static Node NewNode( int nodeData)
	{
		Node temp= new Node();
		temp.nodeData= nodeData;
		temp.leftNode= null;
		temp.rightNode=null;
		
		
		return temp;
	}
	
	public Node insert(Node root, int key) {
		if (root==null) {
		return NewNode(key);
		}
		if (key<root.nodeData) {
			root.leftNode=insert(root.leftNode,key);
		}
		else 
			root.rightNode=insert(root.rightNode,key);
		return root;
	}

	public boolean findPair(Node root,int sum, HashSet<Integer> set)
	{
		
		if (root==null)
			return false;
		
		if (findPair(root.leftNode,sum,set))
			return true;
		
		if (set.contains(sum-root.nodeData)) {
			System.out.println("Pair is Found "+ (sum-root.nodeData)+ "," + root.nodeData);
			return true;
		}
		
		else
			set.add(root.nodeData);
		
		return findPair(root.rightNode,sum,set);
	}
	
	public void findPairWithSum(Node root,int sum) {
		
		HashSet<Integer> set= new HashSet<Integer>();
		if (!findPair(root,sum,set)) {
			System.out.println("Pair Doesn't Exist");
			
		}
	}
	
	
	public static void main(String[] args) {
	
		Node root=null;
		DriverBST obj= new DriverBST();
		root=obj.insert(root,40);
		root=obj.insert(root,20);
		root=obj.insert(root,60);
		root=obj.insert(root,10);
		root=obj.insert(root,30);
		root=obj.insert(root,50);
		root=obj.insert(root,70);
		
		int sum=60;
		
			obj.findPairWithSum(root, sum);
		
	}

}
