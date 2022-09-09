package algorithm.inflearn.ch8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q12 {

    static int n,m;
    static int[][] box;

    static int[] dx = {-1, 0, 0, 1}, dy = {0, -1, 1, 0};

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
        m = sc.nextInt();

        box = new int[m][n];
        Queue<Point> queue = new LinkedList<>();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int input = sc.nextInt();
                box[i][j] = input;
                if(input == 1) queue.add(new Point(i, j));
            }
        }


        int answer = 0;
        if(queue.isEmpty()) {
            System.out.println(0);
            return;
        }

        while(!queue.isEmpty()) {
            answer++;
            int len = queue.size();
            for(int i = 0; i < len; i++) {
                Point p = queue.poll();
                for(int j = 0; j < 4; j++) {
                    int nx = p.x + dx[j];
                    int ny = p.y + dy[j];
                    if(nx >= 0 && nx < m && ny >= 0 && ny < n && box[nx][ny] == 0) {
                        box[nx][ny] = 1;
                        queue.add(new Point(nx, ny));
                    }
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(answer - 1);

    }
}
