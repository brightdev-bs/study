package algorithm.inflearn.ch5;

import java.util.Scanner;
import java.util.Stack;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n+1][n+1];
        for(int i = 1; i < n+1; i++) {
            for(int j = 1; j < n+1; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for(int i = 0; i < m; i++) {
            for(int row = 1; row < n + 1; row++) {
                int doll = board[row][moves[i]];
                if(doll != 0) {
                    if (!stack.isEmpty() && stack.peek() == doll) {
                        cnt++;
                        stack.pop();
                        board[row][moves[i]] = 0;
                        break;
                    } else {
                        stack.push(doll);
                        board[row][moves[i]] = 0;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt * 2);
    }
}
