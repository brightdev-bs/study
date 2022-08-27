package algorithm.inflearn.ch1;

import java.util.Scanner;

public class C9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                sb.append(c);
            }
        }

        System.out.println(Integer.parseInt(sb.toString()));

    }
}
