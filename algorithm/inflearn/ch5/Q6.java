package algorithm.inflearn.ch5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int cnt = 1;
        while(queue.size() != 1) {

            if(cnt == k) {
                cnt = 1;
                queue.poll();
                continue;
            }

            queue.add(queue.poll());
            cnt++;
        }
        System.out.println(queue.poll());
    }
}
