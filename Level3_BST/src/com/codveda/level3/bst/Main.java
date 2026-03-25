package com.codveda.level3.bst;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n=== Binary Search Tree ===");
            System.out.println("1. Insert");
            System.out.println("2. Display (Inorder)");
            System.out.println("3. Search");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    bst.root = bst.insert(bst.root, val);
                    break;

                case 2:
                    System.out.print("BST (Inorder): ");
                    bst.inorder(bst.root);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    int key = sc.nextInt();
                    boolean found = bst.search(bst.root, key);
                    System.out.println(found ? "Found" : "Not Found");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}