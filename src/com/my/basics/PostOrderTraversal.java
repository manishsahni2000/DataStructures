package com.my.basics;

import java.util.Stack;

/*
 * 
 * 1. Right child of 1 exists. 
 Push 3 to stack. Push 1 to stack. Move to left child.
 Stack: 3, 1

 2. Right child of 2 exists. 
 Push 5 to stack. Push 2 to stack. Move to left child.
 Stack: 3, 1, 5, 2

 3. Right child of 4 doesn't exist. '
 Push 4 to stack. Move to left child.
 Stack: 3, 1, 5, 2, 4

 4. Current node is NULL. 
 Pop 4 from stack. Right child of 4 doesn't exist. 
 Print 4. Set current node to NULL.
 Stack: 3, 1, 5, 2

 5. Current node is NULL. 
 Pop 2 from stack. Since right child of 2 equals stack top element, 
 pop 5 from stack. Now push 2 to stack.     
 Move current node to right child of 2 i.e. 5
 Stack: 3, 1, 2

 6. Right child of 5 doesn't exist. Push 5 to stack. Move to left child.
 Stack: 3, 1, 2, 5

 7. Current node is NULL. Pop 5 from stack. Right child of 5 doesn't exist. 
 Print 5. Set current node to NULL.
 Stack: 3, 1, 2

 8. Current node is NULL. Pop 2 from stack. 
 Right child of 2 is not equal to stack top element. 
 Print 2. Set current node to NULL.
 Stack: 3, 1

 9. Current node is NULL. Pop 1 from stack. 
 Since right child of 1 equals stack top element, pop 3 from stack. 
 Now push 1 to stack. Move current node to right child of 1 i.e. 3
 Stack: 1

 10. Repeat the same as above steps and Print 6, 7 and 3. 
 Pop 1 and Print 1.
 * 
 * */

public class PostOrderTraversal {

	Node root;

	public void postOrderIterative(Node root) {

		if (root == null)
			return;

		Stack<Node> s = new Stack<Node>();
		Node current = root;

		while (true) {

			if (current != null) {
				if (current.right != null)
					s.push(current.right);
				s.push(current);
				current = current.left;
				continue;
			}

			if (s.isEmpty())
				return;
			current = s.pop();

			if (current.right != null && !s.isEmpty()
					&& current.right == s.peek()) {
				s.pop();
				s.push(current);
				current = current.right;
			} else {
				System.out.print(current.data + " ");
				current = null;
			}

		}
	}

	public static void main(String[] args) {

		PostOrderTraversal tree = new PostOrderTraversal();

		// Let us create trees shown in above diagram
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		System.out.println("Post order traversal of binary tree is :");
		tree.postOrderIterative(tree.root);

		

	}
}
