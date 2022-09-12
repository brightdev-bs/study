package algorithm.inflearn.ch9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 크루스칼 알고리즘
public class Q6_2 {

    static int[] unf;
    static int answer = 0;

    public static class Edge implements Comparable<Edge> {
        int v1, v2, cost;

        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
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

        unf = new int[v + 1];
        for(int i = 0; i <= v; i++) {
            unf[i] = i;
        }
        ArrayList<Edge> list = new ArrayList<>();
        for(int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            list.add(new Edge(v1, v2, cost));
        }

        Collections.sort(list);

        for (Edge edge : list) {
            int fa = find(edge.v1);
            int fb = find(edge.v2);
            if(fa != fb) {
                union(edge.v1, edge.v2);
                answer += edge.cost;
            }
        }

        System.out.println(answer);
    }

    public static int find(int v) {
        if(v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) unf[fb] = fa;
    }
}
