package algorithm.inflearn.ch6;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }

        Arrays.sort(arr2);
        for(int i = 0; i < n; i++) {
            if(arr2[i] != arr[i]) System.out.print(i + 1 + " ");
        }
    }
}
