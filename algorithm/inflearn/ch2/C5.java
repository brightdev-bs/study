package algorithm.inflearn.ch2;

import java.util.Scanner;

public class C5 {

    static boolean[] memory;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        memory = new boolean[n+1];

        int count = 0;
        for(int i = 2; i <= n; i++) {
            if(!memory[i]) {
                count++;
                for(int j = i + i; j <= n; j += i) {
                    memory[j] = true;
                }
            }
        }

        System.out.println(count);
    }
}
