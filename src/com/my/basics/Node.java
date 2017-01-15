package com.my.basics;

public class Node {

	 protected int data;
	 protected Node left;
	 protected Node right;

	public Node(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right
				+ "]";
	}

}
