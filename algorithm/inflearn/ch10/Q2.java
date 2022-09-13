package algorithm.inflearn.ch10;

import java.util.Scanner;

public class Q2 {

    static int[] dy;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        dy = new int[n+2];

        System.out.println(solution());
    }

    public static int solution() {
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3; i <= n + 1; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }

        return dy[n + 1];
    }
}
