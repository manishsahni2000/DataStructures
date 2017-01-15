package com.my.basics;

/*
 * 
 * sameTree(tree1, tree2)
 1. If both trees are empty then return 1.
 2. Else If both trees are non -empty
 (a) Check data of the root nodes (tree1->data ==  tree2->data)
 (b) Check left subtrees recursively  i.e., call sameTree( 
 tree1->left_subtree, tree2->left_subtree)
 (c) Check right subtrees recursively  i.e., call sameTree( 
 tree1->right_subtree, tree2->right_subtree)
 (d) If a,b and c are true then return 1.
 3  Else return 0 (one is empty and other is not)
 * 
 * */

public class CheckIdenticalTrees {

	Node root1, root2;

	public boolean isIdentical(Node root1, Node root2) {

		// since if both the left and right subtree of 2 trees will have the
		// same arrangement of nodes , hence null will ie on the same position
		// as well
		if (root1 == null && root2 == null) {

			return true;
		}

		return (root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(
				root1.right, root2.right));
	}

	public static void main(String[] args) {

		CheckIdenticalTrees tree = new CheckIdenticalTrees();

		tree.root1 = new Node(1);
		tree.root1.left = new Node(2);
		tree.root1.right = new Node(3);
		tree.root1.left.left = new Node(4);
		tree.root1.left.right = new Node(5);

		tree.root2 = new Node(1);
		tree.root2.left = new Node(2);
		tree.root2.right = new Node(3);
		tree.root2.left.left = new Node(4);
		tree.root2.left.right = new Node(5);

		if (tree.isIdentical(tree.root1, tree.root2))
			System.out.println("Both trees are identical");
		else
			System.out.println("Trees are not identical");

	}

}
