package algorithm.inflearn.ch6;

import java.util.Scanner;

// 다시 풀기
public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for(j = i - 1; j >= 0; j--) {
                if(tmp < arr[j]) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
