package algorithm.inflearn.ch7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q8 {

    static int[] dis = {1, -1, 5};
    static int[] ch = new int[100001];
    static int s, e;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s = sc.nextInt();
        e = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        ch[s] = 1;
        int L = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i++) {
                Integer x = queue.poll();
                for (int di : dis) {
                    int nx = x + di;
                    if(nx == e) {
                        System.out.println(L + 1);
                        return;
                    }

                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.add(nx);
                    }
                }
            }
            L++;
        }

    }
}
