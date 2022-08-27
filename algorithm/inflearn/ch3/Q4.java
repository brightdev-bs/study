package algorithm.inflearn.ch3;

import java.util.Scanner;

// 다시풀기
public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int count = 0;
        int lt = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum == m) {
                count++;
            }

            while(sum >= m) {
                sum -= arr[lt++];
                if(sum == m) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
