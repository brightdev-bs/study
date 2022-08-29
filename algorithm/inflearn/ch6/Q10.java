package algorithm.inflearn.ch6;

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {

    static int[] arr;
    static int n,m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int min = 1;
        int max = arr[n-1];

        int answer = Integer.MIN_VALUE;
        while(min <= max) {
            int middle = (min + max) / 2;
            int check = check(middle);
            if(check >= m) {
                answer = middle;
                min = middle + 1;
            } else {
                max = middle - 1;
            }
        }
        System.out.println(answer);
    }

    static int check(int middle) {
        int current = arr[0];
        int cnt = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] - current >= middle) {
                cnt++;
                current = arr[i];
            }
        }
        return cnt;
    }
}
