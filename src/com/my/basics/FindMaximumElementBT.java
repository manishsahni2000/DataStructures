package com.my.basics;

public class FindMaximumElementBT {

	Node root;

	public int maxValueinBT(Node root) {

		int maxValue = root.data;

		if (root.left != null) {

			maxValue = Math.max(maxValue, maxValueinBT(root.left));
		}
		if (root.right != null) {

			maxValue = Math.max(maxValue, maxValueinBT(root.right));
		}

		return maxValue;
	}

	public static void main(String[] args) {

		FindMaximumElementBT tree_level = new FindMaximumElementBT();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);

		System.out.println("Maximum value in BT is");
		System.out.println(tree_level.maxValueinBT(tree_level.root));
	}

}
