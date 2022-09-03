package algorithm.inflearn.ch8;

import java.util.Scanner;

public class Q3 {

    static int n,m, answer = 0;
    static Problem[] p;

    static class Problem {
        int score, time;

        public Problem(int score, int time) {
            this.score = score;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 문제의 개수
        m = sc.nextInt(); // 제한 시간

        p = new Problem[n];
        for(int i = 0; i < n; i++) {
            int score = sc.nextInt();
            int time = sc.nextInt();
            p[i] = new Problem(score, time);
        }

        DFS(0, 0, 0);
        System.out.println(answer);
    }

    public static void DFS(int L, int time, int sum) {
        if(L == n) {
            if(time <= m)
                answer = Math.max(sum, answer);
            return;
        }
        if(time > m) return;

        DFS(L+1, time + p[L].time, sum + p[L].score);
        DFS(L+1, time, sum);
    }
}
