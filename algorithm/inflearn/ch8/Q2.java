package algorithm.inflearn.ch8;

import java.util.Scanner;

public class Q2 {

    static int c,n;
    static int[] arr;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        c = sc.nextInt(); // 제한 무게
        n = sc.nextInt(); // 바둑이 수

        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(0, 0);
        System.out.println(answer);
    }

    public static void DFS(int L, int sum) {
        if(L == n) {
            if(sum < c) answer = Math.max(sum, answer);
            return;
        }
        if(sum > c) return;
        else {
            DFS(L+1, sum+arr[L]);
            DFS(L + 1, sum);
        }
    }

}
