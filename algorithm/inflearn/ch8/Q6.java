package algorithm.inflearn.ch8;

import java.util.Scanner;

public class Q6 {

    static int n,m;
    static int[] arr, ch, pm;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        ch = new int[n];
        pm = new int[m];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(0);
    }

    public static void DFS(int count) {
        if(count == m) {
            for (int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for(int i = 0; i < n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    pm[count] = arr[i];
                    DFS(count + 1);
                    ch[i] = 0;
                }
            }
        }
    }
}
