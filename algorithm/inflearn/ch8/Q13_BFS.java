package algorithm.inflearn.ch8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q13_BFS {

    static int n;
    static int answer = 0;
    static int[][] island;
    static int[] dx = {-1, 0, 0, 1, -1, -1, 1, 1}, dy = {0, -1, 1, 0, -1, 1, -1, 1};
    static Queue<Point> queue = new LinkedList<>();

    static public class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

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
                    answer++;
                    BFS(i, j);
                }
            }
        }

        System.out.println(answer);
    }

    static void BFS(int x, int y) {
        queue.add(new Point(x, y));
        while(!queue.isEmpty()) {
            Point tmp = queue.poll();
            for(int i = 0; i < 8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && island[nx][ny] == 1) {
                    island[nx][ny] = 0;
                    queue.add(new Point(nx, ny));
                }
            }
        }
    }
}
