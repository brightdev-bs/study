package algorithm.inflearn.ch7;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = recursive(n);
        System.out.println(result);
    }

    static int recursive(int n) {
        if(n == 1) return 1;
        else {
            return recursive(n-1) * n;
        }
    }
}
