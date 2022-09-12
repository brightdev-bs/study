package algorithm.inflearn.ch9;

import java.util.*;

public class Q6 {

    static PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
    static int[] ch;
    static int answer = 0;

    public static class Edge implements Comparable<Edge> {
        int v, cost;

        public Edge(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }


        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();

        ch = new int[v+1];
        ArrayList<ArrayList<Edge>> list = new ArrayList<>();
        for(int i = 0; i <= v; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int ev = sc.nextInt();
            list.get(v1).add(new Edge(v2, ev));
            list.get(v2).add(new Edge(v1, ev));
        }

        ch[1] = 1;
        for (Edge edge : list.get(1)) {
            pq.add(edge);
        }

        while(!pq.isEmpty()) {
            Edge tmp = pq.poll();
            if(ch[tmp.v] == 0) {
                ch[tmp.v] = 1;
                for (Edge edge : list.get(tmp.v)) {
                    pq.add(edge);
                }
                answer += tmp.cost;
            }
        }

        System.out.println(answer);

    }
}
