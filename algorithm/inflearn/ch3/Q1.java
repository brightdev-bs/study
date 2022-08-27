package algorithm.inflearn.ch3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int p = 0;
        int p2 = 0;
        List<Integer> answer = new ArrayList<>();
        while(p < n && p2 < m) {
            if(arr[p] < arr2[p2]){
                answer.add(arr[p++]);
            } else {
                answer.add(arr2[p2++]);
            }
        }

        while(p < n) {
            answer.add(arr[p++]);
        }

        while(p2 < m) {
            answer.add(arr2[p2++]);
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }
}
