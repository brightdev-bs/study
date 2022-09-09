package algorithm.inflearn.ch8;

import java.util.*;

// 꼭 다시 풀기
public class Q14 {

    static int n, m, len;
    static int[][] map;
    static ArrayList<Point> hs = new ArrayList<>();
    static ArrayList<Point> pz = new ArrayList<>();
    static int[] combi;
    static int answer = Integer.MAX_VALUE;
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

        map = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int input = sc.nextInt();
                if(input == 1) {
                    hs.add(new Point(i, j));
                }
                if(input == 2) {
                    pz.add(new Point(i, j));
                }
            }
        }

        len = pz.size();
        combi = new int[m];
        DFS(0, 0);
        System.out.println(answer);
    }


    public static void DFS(int L, int s) {
        if(L == m) {
            int sum = 0;
            for (Point h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    int tmp = Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y);
                    dis = Math.min(dis, tmp);
                }
                sum += dis;
            }
            answer = Math.min(sum,answer);
        } else {
            // 조합 경우의 수
            for(int i = s; i < len; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }
}
