package algorithm.inflearn.ch10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 다시 3번이랑 같은 유형임. (LIS)
public class Q4 {

    static int[] dy;

    public static class Top implements Comparable<Top>{
        int base, height, weight;

        public Top(int base, int height, int weight) {
            this.base = base;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Top o) {
            return o.base - this.base;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        dy = new int[n];

        ArrayList<Top> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int b = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            list.add(new Top(b, h, w));
        }

        Collections.sort(list);

        dy[0] = list.get(0).height;
        int answer = dy[0];
        for(int i = 1; i < n; i++) {
            int max = 0;
            for(int j = i - 1; j >= 0; j--) {
                if(list.get(i).weight < list.get(j).weight && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max + list.get(i).height;
            answer = Math.max(answer, dy[i]);
        }

        System.out.println(answer);



    }
}
