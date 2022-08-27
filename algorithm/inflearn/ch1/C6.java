package algorithm.inflearn.ch1;

import java.util.ArrayList;
import java.util.Scanner;

public class C6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if (s.indexOf(arr[i]) == i) {
                sb.append(arr[i]);
            }
        }

        System.out.println(sb);

    }
}
