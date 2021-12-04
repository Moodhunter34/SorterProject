package com.sparta.mvc.model;

import java.util.ArrayList;

public class BinaryTreeSorter <T extends Comparable<? super T>> {

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

   public void createTree(T value) {
        root = insert(root, value);
   }

       public Node insert(Node node, T value){
           if(node == null){
               return new Node(value);
           }
           if(value.compareTo(node.value) < 0){
               node.left = insert(node.left, value);
           }else if(value.compareTo(node.value) > 0){
               node.right = insert(node.right, value);
           }
           return node;
       }
       public void inOrder(Node node){
           if(node != null){
               inOrder(node.left);
               System.out.print(node.value + ", " );
               inOrder(node.right);
           }
       }
       public void inOrderDesc(Node node){
           if(node != null){
               inOrderDesc(node.right);
               System.out.print(node.value + " ");
               inOrderDesc(node.left);
           }
       }
   }


