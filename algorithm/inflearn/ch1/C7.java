package algorithm.inflearn.ch1;

import java.util.Scanner;

public class C7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next().toLowerCase();
        char[] arr = s.toCharArray();

        int lt = 0, rt = s.length() - 1;
        while(lt < rt) {
            if(arr[lt] != arr[rt]) {
                System.out.println("NO");
                return;
            }
            lt++;
            rt--;
        }

        System.out.println("YES");
    }
}
