package algorithm.inflearn.ch2;

import java.util.Scanner;

public class C7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 0, cnt = 0;
        for(int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if(input == 0) {
                cnt = 0;
                continue;
            }

            if(input == 1) {
                answer += ++cnt;
                continue;
            }
        }

        System.out.println(answer);
    }
}
