package com.my.basics;

import java.util.LinkedList;
import java.util.Queue;

public class FindSumOfAllElementsBT {

	Node root;

	public int recursivelyFindSum(Node root) {

		if (root == null)
			return 0;
		return root.data + recursivelyFindSum(root.left)
				+ recursivelyFindSum(root.right);

	}

	public int nonRecursive(Node root) {

		int sum = 0;

		Queue<Node> q = new LinkedList<>();
		q.offer(root);

		while (!q.isEmpty()) {

			Node newnode = q.poll();
			sum += newnode.data;

			if (newnode.left != null) {
				q.offer(newnode.left);
			}
			if (newnode.right != null) {
				q.offer(newnode.right);
			}

		}

		return sum;

	}

	public static void main(String[] args) {

		FindSumOfAllElementsBT tree = new FindSumOfAllElementsBT();

		// Let us create a binary tree shown in above diagram
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("Sum of all elements of tree recursive is "
				+ tree.recursivelyFindSum(tree.root));

		System.out.println("Sum of all elements of tree non-recursive is "
				+ tree.nonRecursive(tree.root));

		
	}

}
