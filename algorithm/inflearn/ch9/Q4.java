package algorithm.inflearn.ch9;

import java.util.*;

// 다시
public class Q4 {

    static class Lecture implements Comparable<Lecture> {
        int m, d;

        public Lecture(int m, int d) {
            this.m = m;
            this.d = d;
        }

        @Override
        public int compareTo(Lecture o) {
            return o.d - this.d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        List<Lecture> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            list.add(new Lecture(m, d));
            max = Math.max(d, max);
        }

        Collections.sort(list);

        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        int sum = 0;
        int  j = 0;
        for(int i = max; i >= 1; i--) {
            for(; j < n; j++) {
                if(list.get(j).d < i) break;
                pq.add(list.get(j).m);
            }
            if(!pq.isEmpty()) {
                sum += pq.poll();
            }
        }

        System.out.println(sum);




    }
}
