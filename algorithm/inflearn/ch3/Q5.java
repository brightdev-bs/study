package algorithm.inflearn.ch3;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 0; i <= n; i++) {
            arr[i] = i;
        }

        int lt = 1;
        int sum = 0;
        int answer = 0;
        for(int rt = 1; rt < n; rt++) {
            sum += arr[rt];
            if(sum == n) {
                answer++;
            }

            while(sum >= n) {
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }

        System.out.println(answer);
    }
}
