package algorithm.inflearn.ch10;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

    public static class Problem implements Comparable<Problem> {
        int score, time;

        public Problem(int score, int time) {
            this.score = score;
            this.time = time;
        }

        @Override
        public int compareTo(Problem o) {
            return this.time - o.time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] dy = new int[m+1];
        for(int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            for(int j = m; j >= t; j--) {
                dy[j] = Math.max(dy[j], dy[j - t] + s);
            }
        }

        System.out.println(dy[m]);

    }
}
