package com.sparta.mvc.model;

import java.util.ArrayList;

public class BinaryTreeSorter <T extends Comparable<? super T>> {

    // creating root node to initialize
    public Node root;

    public class Node {
       T value;
       Node left, right;
       Node(T value){
           this.value = value;
           left = null;
           right = null;
       }
   }
    // creating binary tree sort
   public void createTree(T value) {
        root = insert(root, value);
   }

       public Node insert(Node node, T value){
           if(node == null){
               return new Node(value);
           }
           if(value.compareTo(node.value) < 0){ // Move value to the left if passed value is less than current node
               node.left = insert(node.left, value);
           }else if(value.compareTo(node.value) > 0){ // Move value to the right if passed value is less than current node
               node.right = insert(node.right, value);
           }
           return node;
       }
       // Tree sort in ascending order
       public void inOrder(Node node){
           if(node != null){
               inOrder(node.left);
               System.out.print(node.value + ", " );
               inOrder(node.right);
           }
       }
    // Tree sort in descending order
       public void inOrderDesc(Node node){
           if(node != null){
               inOrderDesc(node.right);
               System.out.print(node.value + " ");
               inOrderDesc(node.left);
           }
       }
   }


