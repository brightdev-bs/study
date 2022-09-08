package algorithm.inflearn.ch8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q11 {

    static int[] xMove = {-1, 0, 0, 1}, yMove = {0, -1, 1, 0};
    static int[][] board = new int[8][8];
    static int[][] dis = new int[8][8];
    static int answer = 0;

    public static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        BFS();
        if(dis[7][7] == 0)
            System.out.println(-1);
        else
            System.out.println(dis[7][7]);
    }

    public static void BFS() {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(1,1));
        board[1][1] = 1;
        while(!queue.isEmpty()) {
            Point p = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nx = p.x + xMove[i];
                int ny = p.y + yMove[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.add(new Point(nx, ny));
                    dis[nx][ny] = dis[p.x][p.y] + 1;
                }
            }
        }
    }
}
