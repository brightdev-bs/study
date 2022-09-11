package algorithm.inflearn.ch9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 어떻게 풀었는지 꼭 기억하기 (원리를 이해해야 함)
public class Q3 {

    public static class Schedule {
        char status;
        int time;

        public Schedule (int time, char status) {
            this.status = status;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Schedule> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int l = sc.nextInt();
            list.add(new Schedule(c, 's'));
            list.add(new Schedule(l, 'e'));
        }

        int cnt = 0;
        int answer = Integer.MIN_VALUE;
        Collections.sort(list, (o1, o2) -> {
            if(o1.time == o2.time) return o1.status - o2.status;
            else return o1.time - o2.time;
        });

        for (Schedule s : list) {
            if(s.status == 's') cnt++;
            else cnt--;
            answer = Math.max(cnt, answer);
        }

        System.out.println(answer);
    }
}