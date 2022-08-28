package algorithm.inflearn.ch6;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        int[] cache = new int[s];
        int[] jobs = new int[n];
        for(int i = 0; i < n; i++) {
            jobs[i] = sc.nextInt();
        }

        for(int x : jobs) {
            int pos = -1;
            for(int i = 0; i < s; i++) { if(cache[i] == x) pos = i; }
            if(pos == -1) {
                for(int i = s - 1; i > 0; i--) {
                    cache[i] = cache[i-1];
                }
            }

            if(pos != -1) {
                for(int i = pos; i > 0; i--) {
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }

        for (int i : cache) {
            System.out.print(i + " ");
        }
    }

}
