package algorithm.inflearn.ch9;

import javax.management.relation.Relation;
import java.util.Scanner;

public class Q5 {

    static int[] unf;

    static class Relation {
        int a, b;

        public Relation(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 반 학생 수
        int m = sc.nextInt(); // 숫자쌍

        unf = new int[n+1];
        for(int i = 1; i <= n; i++) {
            unf[i] = i;
        }
        for(int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a, b);
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        if(find(a) == find(b)) System.out.println("YES");
        else System.out.println("NO");


    }

    public static int find(int v) {
        if(v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) unf[fb] = unf[fa];
    }
}