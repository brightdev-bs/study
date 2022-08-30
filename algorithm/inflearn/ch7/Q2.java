package algorithm.inflearn.ch7;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        recursive(n);
    }

    public static void recursive(int n) {
        if(n == 0) return;
        else {
            recursive(n / 2);
            System.out.print((n % 2));
        }
    }
}
