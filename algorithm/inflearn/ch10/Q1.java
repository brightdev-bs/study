package algorithm.inflearn.ch10;

import java.util.Scanner;

public class Q1 {
    static int[] dy;
    static int answer = 0, n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        dy = new int[n+1];
        dy[1] = 1;
        dy[2] = 2;
        System.out.println(DFS());
    }

    public static int DFS() {
        for(int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[n];
    }
}
