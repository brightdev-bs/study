package algorithm.inflearn.ch8;

import java.util.Scanner;

// 다시 풀어보기
public class Q8 {

    static int n, f;
    static int[] combi, firstRow, ch;
    static int[][] memory = new int[35][35];
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        f = sc.nextInt();

        combi = new int[n];
        firstRow = new int[n];
        ch = new int[n + 1];

        for(int i = 0; i < n; i++) {
            combi[i] = getCombination(n-1, i);
        }
        DFS(0,0);
    }

    public static void DFS(int L, int sum) {
        if(flag) return;
        if(L == n) {
            if(sum == f) {
                flag = true;
                for (int i : firstRow) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    firstRow[L] = i;
                    DFS(L + 1, sum + firstRow[L] * combi[L]);
                    ch[i] = 0;
                }
            }
        }
    }

    public static int getCombination(int n, int r) {
        if(memory[n][r] > 0) return memory[n][r];
        if(r == 0 || n == r) return 1;
        else return memory[n][r] = getCombination(n-1, r) + getCombination(n-1,r-1);
    }

}
