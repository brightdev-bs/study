package algorithm.inflearn.ch1;

import java.util.Scanner;

public class C1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next().toUpperCase();
        char c = Character.toUpperCase(sc.next().charAt(0));

        int count = 0;
        for (char i : s.toCharArray()) {
            if(i == c) count++;
        }

        System.out.println(count);

    }
}
