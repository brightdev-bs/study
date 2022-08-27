package algorithm.inflearn.ch4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;


// 다시
public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        TreeSet<Integer> tree = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    tree.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }

        int cnt = 0;
        for(int x : tree) {
            cnt++;
            if(cnt == m) {
                System.out.println(x);
                return;
            }
        }
        System.out.println(-1);
    }
}
