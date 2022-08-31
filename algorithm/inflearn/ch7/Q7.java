package algorithm.inflearn.ch7;

import java.util.LinkedList;
import java.util.Queue;

public class Q7 {

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
        root.rt.lt=new Node(6);
        root.rt.rt=new Node(7);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i++) {
                Node tmp = queue.poll();
                System.out.print(tmp.data + " ");
                if(tmp.lt != null) queue.add(tmp.lt);
                if(tmp.rt != null) queue.add(tmp.rt);
            }
        }
    }
}
