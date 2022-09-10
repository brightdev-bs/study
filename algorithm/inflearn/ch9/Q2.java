package algorithm.inflearn.ch9;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    public static class Meeting {
        int start, end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Meeting[] arr = new Meeting[n];
        for(int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr[i] = new Meeting(s, e);
        }

        Arrays.sort(arr, (o1,o2) -> {
            if(o1.end == o2.end) return o1.start-o2.start;
            else return o1.end - o2.end;
        });

        int et = 0;
        int cnt = 0;
        for (Meeting meeting : arr) {
            if(meeting.start >= et) {
                et = meeting.end;
                cnt++;
            }
        }


        System.out.println(cnt);
    }
}
