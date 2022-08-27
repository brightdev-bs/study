package algorithm.inflearn.ch2;

import java.util.Scanner;

public class C2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int pr = sc.nextInt();
        int count = 1;
        for(int i = 1; i < n; i++) {
            int input = sc.nextInt();
            if(pr < input)  {
                count++;
                pr = input;
            }
        }

        System.out.println(count);
    }
}
