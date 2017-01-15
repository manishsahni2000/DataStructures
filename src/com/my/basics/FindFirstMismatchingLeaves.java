package com.my.basics;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 
 * Print first pair of mis-matching leaves (first pair as in in-order) given two pre-order traversal arrays of BSTs. 

 e.g.


 For
 5
 4      8
 2  4    6  9
 Pre-order Sequence as [5,4,2,4,8,6,9]
 &
 5
 3     8
 2  4   7  9
 Pre-order Sequence2 as [5,3,2,4,8,7,9]
 Print “4, 3”.
 * 
 * 
 * */

public class FindFirstMismatchingLeaves {

	Node root1, root2;

	public void mismatchingLeaves(Node root1, Node root2) {

		Queue<String> q = new LinkedList<String>();

		if (root1.data != root2.data) {

			q.offer(String.valueOf(root1.data) + ","
					+ String.valueOf(root2.data));
			System.out.println("Mismatching pairs are " + q.peek());
		}

		if (root1.left != null && root2.left != null)
			mismatchingLeaves(root1.left, root2.left);
		if (root1.right != null && root2.right != null)
			mismatchingLeaves(root1.right, root2.right);

	}

	public static void main(String[] args) {

		FindFirstMismatchingLeaves tree = new FindFirstMismatchingLeaves();

		tree.root1 = new Node(5);
		tree.root1.left = new Node(4);
		tree.root1.right = new Node(8);
		tree.root1.left.left = new Node(2);
		tree.root1.left.right = new Node(4);
		tree.root1.right.left = new Node(6);
		tree.root1.right.right = new Node(9);

		tree.root2 = new Node(5);
		tree.root2.left = new Node(3);
		tree.root2.right = new Node(8);
		tree.root2.left.left = new Node(2);
		tree.root2.left.right = new Node(4);
		tree.root2.right.left = new Node(7);
		tree.root2.right.right = new Node(9);

		tree.mismatchingLeaves(tree.root1, tree.root2);

	}

}
