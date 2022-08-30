package algorithm.inflearn.ch7;

import java.util.Scanner;

public class Q4 {

    static int[] arr = new int[11];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i : arr) {
            System.out.print(i + " 1");
        }
    }

    public static int fibo(int n) {
        if(arr[n] != 0) return arr[n];
        if(n == 1 || n == 2) return arr[n] = 1;
        else {
            return arr[n] = fibo(n - 2) + fibo(n - 1);
        }
    }
}
