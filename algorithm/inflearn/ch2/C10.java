package algorithm.inflearn.ch2;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class C10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();
        char c = sc.next().charAt(0);

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(arr[i] == c) list.add(i);
        }

        for(int i = 0; i < s.length(); i++) {
            int ans = Integer.MAX_VALUE;
            for(int j = 0; j < list.size(); j++) {
                int gap = Math.abs(i - list.get(j));
                ans = Math.min(ans, gap);
            }
            System.out.print(ans + " ");
        }
    }
}
