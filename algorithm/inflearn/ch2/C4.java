package algorithm.inflearn.ch2;

import java.util.ArrayList;
import java.util.Scanner;

public class C4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for(int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
