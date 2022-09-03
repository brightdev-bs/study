package algorithm.inflearn.ch8;

import java.util.Scanner;

import static java.lang.System.exit;

public class Q1 {
    static int[] arr;
    static int[] ch;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        ch = new int[n];
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(0);
        System.out.println("NO");

    }

    public static void DFS(int idx) {

        if (check()) {
            System.out.println("YES");
            exit(0);
        }
        if (idx == n) return;
        else {
            if (ch[idx] == 0) {
                ch[idx] = 1;
                DFS(idx + 1);
                ch[idx] = 0;
                DFS(idx + 1);
            }
        }
    }

    static boolean check() {
        int aSum = 0;
        int bSum = 0;
        for(int i = 0; i < n; i++) {
            if(ch[i] == 0) {
                aSum += arr[i];
            } else {
                bSum += arr[i];
            }
        }

        if(aSum == bSum) return true;
        else return false;
    }
}
