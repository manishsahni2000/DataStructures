package com.my.basics;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Algorithm:
 Use a path array path[] to store current root to leaf path. 
 Traverse from root to all leaves in top-down fashion.
 While traversing, store data of all nodes in current path in array path[]. When we reach a leaf node, print the path array.
 * 
 * */

public class PrintAllRoottoLeafPath {

	Node root;
	int path[] = new int[3];

	public void printPath(Node root, int pathLen) {

		

		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);

		while (!q.isEmpty()) {

			Node newNode = q.poll();

			path[pathLen] = newNode.data;
			pathLen++;

			if (newNode.left != null) {

				printPath(newNode.left, pathLen);

			}
			if (newNode.right != null) {

				printPath(newNode.right, pathLen);
			}

			if (newNode.left == null && newNode.right == null) {

				for (int i = 0; i < path.length; i++) {

					System.out.println(path[i] + " ");
				}
			}

		}

	}

	public static void main(String[] args) {

		PrintAllRoottoLeafPath tree = new PrintAllRoottoLeafPath();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(2);

		tree.printPath(tree.root, 0);
	}

}
