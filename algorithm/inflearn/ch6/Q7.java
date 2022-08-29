package algorithm.inflearn.ch6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q7 {

    static class Point implements Comparable<Point> {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x == o.x) return this.y - o.y;
            else return this.x - o.x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Point[] p = new Point[n];
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            p[i] = new Point(x, y);
        }

        Arrays.sort(p);
        for (Point point : p) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
