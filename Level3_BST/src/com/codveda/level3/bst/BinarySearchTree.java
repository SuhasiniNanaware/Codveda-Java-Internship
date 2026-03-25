package com.codveda.level3.bst;

public class BinarySearchTree {

    TreeNode root;

    // Insert
    public TreeNode insert(TreeNode root, int data) {

        if (root == null) {
            return new TreeNode(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Inorder Traversal
    public void inorder(TreeNode root) {

        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Search
    public boolean search(TreeNode root, int key) {

        if (root == null) return false;

        if (root.data == key) return true;

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
}