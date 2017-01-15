package com.my.basics;

import java.util.Stack;

/*
 * 
 * 	1) Create an empty stack nodeStack and push root node to stack.
 2) Do following while nodeStack is not empty.
 ….a) Pop an item from stack and print it.
 ….b) Push right child of popped item to stack
 ….c) Push left child of popped item to stack
 * 
 * */

public class PreOrderTraversal {

	Node root;

	public void preOrderTraversal(Node root) {

		Stack<Node> stack = new Stack<Node>();

		stack.push(root);

		while (!stack.isEmpty()) {

			Node node = stack.pop();
			System.out.println(node.data + " ");

			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null)
				stack.push(node.left);
		}

	}

	public static void main(String[] args) {

		PreOrderTraversal tree = new PreOrderTraversal();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(2);
		tree.preOrderTraversal(tree.root);

	}

}
