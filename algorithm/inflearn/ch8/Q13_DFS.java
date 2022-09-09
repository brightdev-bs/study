package algorithm.inflearn.ch8;

import java.util.Scanner;

public class Q13_DFS {

    static int n;
    static int answer = 0;
    static int[][] island;
    static int[] dx = {-1, 0, 0, 1, -1, -1, 1, 1}, dy = {0, -1, 1, 0, -1, 1, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        island = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                island[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(island[i][j] == 1) {
                    island[i][j] = 0;
                    DFS(i, j);
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }

    public static void DFS(int x, int y) {
        for(int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n && island[nx][ny] == 1) {
                island[nx][ny] = 0;
                DFS(nx, ny);
            }
        }
    }
}
