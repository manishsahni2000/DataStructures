package com.my.basics;

public class RecursiveMethodToFindHieghtBT {

	Node root;

	public int maxHieght(Node root) {

		int maxHieght = 0;
		int leftSubTreeHieght = 0;
		int rightSubtreeHieght = 0;

		if (root.left != null) {

			leftSubTreeHieght = maxHieght(root.left);
		}
		if (root.right != null) {

			rightSubtreeHieght = maxHieght(root.right);
		}

		maxHieght = leftSubTreeHieght > rightSubtreeHieght ? leftSubTreeHieght + 1
				: rightSubtreeHieght + 1;

		// +1 is including the root
		return maxHieght;
	}

	public static void main(String[] args) {

		RecursiveMethodToFindHieghtBT tree = new RecursiveMethodToFindHieghtBT();

		// Let us create a binary tree shown in above diagram
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("Height of tree is " + tree.maxHieght(tree.root));
	}

}
