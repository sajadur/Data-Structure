package com.datastructure.tree.introduction;

public class Binarytree {
    // Root of Binary Tree
    Node root;
    // Constructors
    Binarytree(int key){
        root = new Node(key);
    }

    Binarytree(){
        root = null;
    }

    public static void main(String[] args){
        Binarytree tree = new Binarytree();

        // Create Root
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);

        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
        System.out.println(tree.root);
    }
}
