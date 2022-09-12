package algorithm.inflearn.ch9;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {

    static int[] dis;

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

        int n = sc.nextInt();
        int m = sc.nextInt();

        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        ArrayList<ArrayList<Edge>> list = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < 9; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            list.get(v1).add(new Edge(v2, cost));
        }

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        dis[1] = 0;
        pq.add(new Edge(1, 0));
        while(!pq.isEmpty()) {
            Edge tmp = pq.poll();
            int now = tmp.v;
            int nowCost = tmp.cost;
            if(dis[now] < nowCost) continue;

            for (Edge edge : list.get(now)) {
                if(dis[edge.v] > edge.cost + nowCost) {
                    dis[edge.v] = edge.cost + nowCost;
                    pq.add(new Edge(edge.v, edge.cost + nowCost));
                }
            }
        }

        for(int i = 2; i <= n; i++) {
            if(dis[i] != Integer.MAX_VALUE)
                System.out.println(i + " : " + dis[i]);
            else
                System.out.println("impossible");
        }
    }
}
