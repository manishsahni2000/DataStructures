package com.my.basics;

import java.util.LinkedList;
import java.util.Queue;

//Level order traversal of a tree is breadth first traversal for the tree.

public class LevelOrderTraversal {

	Node root;

	public void levelOrderTraversal(Node root) {

		if (root == null)
			return;

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {

			Node node = queue.poll();
			System.out.println(node.data);

			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);

		}
	}

	public static void main(String[] args) {

		LevelOrderTraversal tree_level = new LevelOrderTraversal();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(3);
		tree_level.root.right = new Node(2);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);

		System.out.println("Level order traversal of binary tree is - ");
		tree_level.levelOrderTraversal(tree_level.root);

	}

}
