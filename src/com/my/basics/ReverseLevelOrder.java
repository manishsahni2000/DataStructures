package com.my.basics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {

	Node root;

	public void reversseLevelOrder(Node root) {

		Stack<Node> S = new Stack();
		Queue<Node> Q = new LinkedList();
		Q.add(root);

		// Do something like normal level order traversal order.Following
		// are the differences with normal level order traversal
		// 1) Instead of printing a node, we push the node to stack
		// 2) Right subtree is visited before left subtree

		while (!Q.isEmpty()) {

			/* Dequeue node and make it root */
			root = Q.peek();
			Q.remove();

			S.push(root);

			/* Enqueue right child */
			if (root.right != null)
				// NOTE: RIGHT CHILD IS ENQUEUED BEFORE LEFT
				Q.add(root.right);

			/* Enqueue left child */
			if (root.left != null)
				Q.add(root.left);

		}

		// Now pop all items from stack one by one and print them
		while (S.empty() == false) {
			root = S.peek();
			System.out.print(root.data + " ");
			S.pop();
		}

	}

	public static void main(String[] args) {

		ReverseLevelOrder tree = new ReverseLevelOrder();

		// Let us create trees shown in above diagram
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		System.out.println("Level Order traversal of binary tree is :");
		tree.reversseLevelOrder(tree.root);

	}
}
