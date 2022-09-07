package algorithm.inflearn.ch8;

import java.util.Scanner;

public class Q9 {

    static int n, m;
    static int[] arr, ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        DFS(0, 1);
    }

    public static void DFS(int L, int s) {
        if(L == m) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for(int i = s; i <= n; i++) {
                arr[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
}
