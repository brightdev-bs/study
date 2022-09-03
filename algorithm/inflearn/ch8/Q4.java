package algorithm.inflearn.ch8;

import java.util.Scanner;

public class Q4 {

    static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        DFS(0, new int[m]);
    }

    public static void DFS(int selectCount, int[] arr) {

        if(selectCount == m) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for(int i = 1; i <= n; i++) {
                arr[selectCount] = i;
                DFS(selectCount + 1, arr);
            }
        }
    }
}
