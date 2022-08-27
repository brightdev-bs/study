package algorithm.inflearn.ch2;

import java.util.ArrayList;
import java.util.Scanner;

public class C6 {

    static ArrayList<Integer> answer = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            solution(num);
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }

    static void solution(int n) {
        // 숫자 뒤바꾸기
        int rev = 0;
        while(n > 0) {
            int tmp = n % 10;
            rev = rev * 10 + tmp;
            n = n / 10;
        }
        if(isPrime(rev)) {
            answer.add(rev);
        }
    }

    static boolean isPrime(int n) {
        if(n == 1) return false;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
