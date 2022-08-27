package algorithm.inflearn.ch2;

import java.util.Scanner;

public class C9 {

    static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        board = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            int cnt2 = 0;
            for(int j = 0; j < n; j++) {
                cnt += board[i][j];
                cnt2 += board[j][i];
            }
            answer = Math.max(answer, cnt);
            answer = Math.max(answer, cnt2);
        }

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            cnt += board[i][i];
        }
        answer = Math.max(answer, cnt);
        cnt = 0;

        for(int i = n-1, j = 0; i >= 0; i--, j++) {
            cnt += board[i][j];
        }
        answer = Math.max(answer, cnt);

        System.out.println(answer);

    }
}
