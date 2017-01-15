package com.my.basics;

import java.util.LinkedList;
import java.util.Queue;

// we will use queue 
public class FindHieghtBTNonRecursive {

	Node root;

	public int maxHieghtAnotherway(Node root) {
		int count = 0;

		if (root == null)
			return 0;

		Queue<Node> q = new LinkedList<Node>();

		q.offer(root);

		while (!q.isEmpty()) {

			count++;
			Node newNode = q.poll();

			if (newNode.left == null && newNode.right == null) {
				return count;
			}
			if (newNode.left != null) {
				q.offer(newNode.left);
			}
			if (newNode.right != null) {
				q.offer(newNode.right);
			}

		}

		return count;

	}

	public int maxhieght(Node root) {// Base Case
		if (root == null)
			return 0;

		// Create an empty queue for level order tarversal
		Queue<Node> q = new LinkedList();

		// Enqueue Root and initialize height
		q.add(root);
		int height = 0;

		while (true) {
			// nodeCount (queue size) indicates number of nodes
			// at current level.
			int nodeCount = q.size();
			if (nodeCount == 0)
				return height;
			height++;

			// Dequeue all nodes of current level and Enqueue all
			// nodes of next level
			while (nodeCount > 0) {
				Node newnode = q.peek();
				q.remove();
				if (newnode.left != null)
					q.add(newnode.left);
				if (newnode.right != null)
					q.add(newnode.right);
				nodeCount--;
			}
		}
	}

	public static void main(String[] args) {

		FindHieghtBTNonRecursive tree = new FindHieghtBTNonRecursive();

		// Let us create a binary tree shown in above diagram
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("Height of tree is "
				+ tree.maxHieghtAnotherway(tree.root));

	}

}
