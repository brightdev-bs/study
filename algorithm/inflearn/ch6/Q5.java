package algorithm.inflearn.ch6;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            int input = sc.nextInt();
            for(int j = 0; j < i; j++) {
                if(input == arr[j]) {
                    System.out.println("D");
                    return;
                }
            }
            arr[i] = input;
        }

        System.out.println("U");

    }
}
