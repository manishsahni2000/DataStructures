package com.my.basics;

/*
 * The idea is to traverse the given Binary Tree. For every node, check if it is a leaf node. 
 * If yes, then return 1. If not leaf node then if left subtree is NULL, then recur for right subtree. 
 * And if right subtree is NULL, then recur for left subtree. 
 * If both left and right subtrees are not NULL, then take the minimum of two heights.
 * */

public class FindMinBTHieghtRecursive {

	Node root;

	public int findMinHieght(Node root) {
		if (root == null) {
			return 0;
		}
		int ldepth = findMinHieght(root.left);
		int rdepth = findMinHieght(root.right);
		if (ldepth == 0) {
			return 1 + rdepth;
		} else if (rdepth == 0) {
			return 1 + ldepth;
		}

		return (1 + Math.min(rdepth, ldepth));
	}

	public static void main(String[] args) {

		FindMinBTHieghtRecursive tree = new FindMinBTHieghtRecursive();

		// Let us create trees shown in above diagram
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("The minimum depth of " + "binary tree is : "
				+ tree.findMinHieght(tree.root));

	}

}
