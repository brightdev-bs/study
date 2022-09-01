package algorithm.inflearn.ch7;

import java.util.LinkedList;
import java.util.Queue;

public class Q9 {

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
        root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int L = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node node = queue.poll();
                if (node.lt == null && node.rt == null) {
                    System.out.println(L);
                    return;
                }
                if (node.lt != null) queue.add(node.lt);
                if (node.rt != null) queue.add(node.rt);
            }
            L++;
        }
    }
}
