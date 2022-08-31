package algorithm.inflearn.ch7;

import java.util.Scanner;

public class Q6 {
    static int n;
    static int[] ck;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        ck = new int[n];

        DFS(0);
    }

    public static void DFS(int start) {
        if(start == n) {
            for(int i = 0; i < n; i++) {
                if(ck[i] != 0) System.out.print(i + 1 + " ");
            }
            System.out.println();
        } else {
            ck[start] = 1;
            DFS(start+1);
            ck[start] = 0;
            DFS(start+1);
        }
    }
}
