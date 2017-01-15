package com.my.basics;

import java.util.LinkedList;
import java.util.Queue;

/*
 * To find nymber of half nodes in a tree
 * means the one who have only one child
 * 
 * */

public class FindHalfNodesBT {

	Node root;

	public int halfNodes(Node root) {

		int count = 0;

		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);

		while (!q.isEmpty()) {

			Node newNode = q.poll();

			if ((newNode.left == null && newNode.right != null)
					|| (newNode.right == null && newNode.left != null)
					|| (newNode.left != null && newNode.right != null)) {

				count++;
			}
			if (newNode.left != null)
				q.offer(newNode.left);
			if (newNode.right != null)
				q.offer(newNode.right);
		}

		return count;

	}

	public static void main(String[] args) {

		FindHalfNodesBT tree = new FindHalfNodesBT();

		// Let us create a binary tree shown in above diagram
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(8);

		System.out.println("Number of Half Nodes in a tree is "
				+ tree.halfNodes(tree.root));
	}

}
