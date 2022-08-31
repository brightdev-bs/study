package algorithm.inflearn.ch7;

import org.w3c.dom.Node;

import java.util.Scanner;

public class Q5 {
    static class Node{
        int data;
        Node lt, rt;
        public Node(int val) {
            data=val;
            lt=rt=null;
        }
    }

    static Node root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        root.rt.lt=new Node(6);
        root.rt.rt=new Node(7);

        // 전위 순회
        preorder(root);
        System.out.println();

        // 중위 순회
        inorder(root);
        System.out.println();

        // 후위 순회
        postOrder(root);

    }

    static void preorder(Node root) {
        System.out.print(root.data + " ");
        if(root.lt != null) preorder(root.lt);
        if(root.rt != null) preorder(root.rt);
    }

    static void inorder(Node root) {
        if(root.lt != null) inorder(root.lt);
        System.out.print(root.data + " ");
        if(root.rt != null) inorder(root.rt);
    }

    static void postOrder(Node root) {
        if(root.lt != null) inorder(root.lt);
        if(root.rt != null) inorder(root.rt);
        System.out.print(root.data + " ");
    }


}
