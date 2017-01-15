package com.my.basics;

import java.util.LinkedList;
import java.util.Queue;

/* 
 * A full node is one who have both left child and the right child
 * */

public class FindFullNOdesBT {

	Node root;

	public int fullNodes(Node node) {

		int count = 0;

		Queue<Node> q = new LinkedList<>();
		q.offer(node);

		while (!q.isEmpty()) {

			Node newNode = q.poll();
			if (newNode.left != null && newNode.right != null) {
				count++;
			}  if (newNode.left != null) {
				q.offer(newNode.left);
			}  if (newNode.right != null) {
				q.offer(newNode.right);
			}

		}

		return count;

	}

	public static void main(String[] args) {

		FindFullNOdesBT tree = new FindFullNOdesBT();

		// Let us create a binary tree shown in above diagram
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("Number of Full Nodes in a tree is "
				+ tree.fullNodes(tree.root));
	}

}
