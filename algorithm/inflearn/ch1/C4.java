package algorithm.inflearn.ch1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> answer = new ArrayList<>();
        while(n-- > 0) {
            String s = sc.next();
            String s1 = new StringBuilder(s).reverse().toString();
            answer.add(s1);
        }

        System.out.println(answer);

//        while(n-- > 0) {
//            String s = sc.next();
//            char[] arr = s.toCharArray();
//            for (int i = s.length() - 1; i >= 0; i--) {
//                System.out.print(arr[i]);
//            }
//            System.out.println();
//        }
    }
}
