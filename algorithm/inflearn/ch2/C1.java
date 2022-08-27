package algorithm.inflearn.ch2;

import java.util.Scanner;

public class C1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int pr = sc.nextInt();
        System.out.print(pr + " ");
        for(int i = 1; i < n; i++) {
            int nx = sc.nextInt();
            if(pr < nx) System.out.print(nx + " ");
            pr = nx;
        }
    }
}
