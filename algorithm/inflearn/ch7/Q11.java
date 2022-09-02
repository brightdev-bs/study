package algorithm.inflearn.ch7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 다시
public class Q11 {

    static int[][] graph;
    static int n,m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }


        for(int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        int[] ch = new int[n+1];
        int L = 1;
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i++) {
                Integer a = queue.poll();
                for (Integer b : list.get(a)) {
                    if(ch[b] == 0) {
                        ch[b] = L;
                        queue.add(b);
                    }
                }
            }
            L++;
        }

        for(int i =2; i <= n; i++) {
            System.out.println(i + " : " + ch[i]);
        }


    }

}
