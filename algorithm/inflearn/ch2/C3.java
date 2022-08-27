package algorithm.inflearn.ch2;

import java.util.ArrayList;
import java.util.Scanner;

public class C3 {

    static ArrayList<String> answer = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if(a[i] == b[i]) answer.add("D");
            else if(a[i] == 1 && b[i] == 3) answer.add("A");
            else if(a[i] == 2 && b[i] == 1) answer.add("A");
            else if(a[i] == 3 && b[i] == 2) answer.add("A");
            else answer.add("B");
        }

        for (String s : answer) {
            System.out.println(s);
        }
    }
}
