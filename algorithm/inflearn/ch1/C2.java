package algorithm.inflearn.ch1;

import java.util.Scanner;

public class C2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        StringBuilder sb = new StringBuilder();
        for(char c : input.toCharArray()) {
            if(Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            else sb.append(Character.toUpperCase(c));
        }

        System.out.println(sb);
    }
}
