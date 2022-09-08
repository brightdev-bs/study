package algorithm.inflearn.ch8;

import java.util.Scanner;

public class Q10 {

    static int[] xMove = {-1, 0, 0, 1}, yMove = {0, -1, 1, 0};
    static int[][] board = new int[7][7];
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        board[0][0] = 1;
        DFS(0, 0);
        System.out.println(answer);
    }

    public static void DFS(int x, int y) {
        if(x == 6 && y == 6) {
            answer++;
        } else {
            for(int i = 0; i < 4; i++) {
                int nx = x + xMove[i];
                int ny = y + yMove[i];
                if(nx >= 0 && nx < 7 && ny >= 0 && ny < 7) {
                    if(board[nx][ny] == 0) {
                        board[nx][ny] = 1;
                        DFS(nx, ny);
                        board[nx][ny] = 0;
                    }
                }
            }
        }
    }
}
