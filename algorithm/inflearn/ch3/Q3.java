package algorithm.inflearn.ch3;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] income = new int[n];
        for(int i = 0; i < n; i++) {
            income[i] = sc.nextInt();
        }

        int max = 0;
        for(int i = 0; i < k; i++) {
            max += income[i];
        }
        int answer = max;

        for(int i = k; i < n; i++) {
            max += (income[i] - income[i-k]);
            answer = Math.max(answer, max);
        }

        System.out.println(answer);
    }
}
