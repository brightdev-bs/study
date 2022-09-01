package algorithm.inflearn.ch7;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10_2 {

    static int[] ch;
    static ArrayList<ArrayList<Integer>> list;
    static int n,m;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        ch = new int[n + 1];
        list = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
        }
        ch[1] = 1;
        DFS(1);

        System.out.println(count);
    }

    static void DFS(int idx) {
        if(idx == n) {
            count++;
        } else {
            for (Integer integer : list.get(idx)) {
                if(ch[integer] == 0) {
                    ch[integer] = 1;
                    DFS(integer);
                    ch[integer] = 0;
                }
            }
        }
    }
}
