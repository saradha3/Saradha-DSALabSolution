package com.dsa.longestpath;

import java.util.ArrayList;

class Node{
	int data;
	Node left;
	Node right;
}

public class Main {
	
	static Node newNode(int key) {
		Node newnode = new Node();
		newnode.data = key;
		newnode.left = null;
		newnode.right = null;
		return newnode;
	}
	
	static ArrayList<Integer> findLongestPath(Node root){
		if(root == null) {
			return new ArrayList<Integer>();
		}
		
		ArrayList<Integer> leftnode = findLongestPath(root.left);
		ArrayList<Integer> rightnode = findLongestPath(root.right);
		
		if(leftnode.size()>rightnode.size()) {
			leftnode.add(root.data);
		}
		else {
			rightnode.add(root.data);
		}
		return (leftnode.size()>rightnode.size()?leftnode:rightnode);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = newNode(100);
		root.left = newNode(20);
		root.right = newNode(130);
		root.left.left = newNode(10);
		root.left.right = newNode(50);
		root.right.left = newNode(110);
		root.right.right = newNode(140);
		root.left.left.left = newNode(5);
		
		ArrayList<Integer> longestPath = findLongestPath(root);
		System.out.print(longestPath.get(longestPath.size()-1));
		for(int i=longestPath.size()-2;i>=0;i--) {
			System.out.print("-> "+longestPath.get(i));
		}
		

	}

}
