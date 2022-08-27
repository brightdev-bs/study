package algorithm.inflearn.ch3;

import java.util.Scanner;

// PASS
public class Q4r {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lt = 0;
        int sum = 0;
        int cnt = 0;
        for(int rt = 0; rt < n; rt++) {
            while(sum >= m) {
                sum -= arr[lt++];
                if(sum == m) cnt++;
            }
            sum += arr[rt];
            if(sum == m) cnt++;
        }

        System.out.println(cnt);

    }
}
