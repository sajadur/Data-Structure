package com.datastructure.tree.introduction;

public class Node {
    public int key;
    public Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
