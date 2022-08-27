package algorithm.inflearn.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q2 {

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

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int p = 0;
        int p2 = 0;
        List<Integer> answer = new ArrayList<>();
        while(p < n && p2 < m) {
            if(arr[p] == arr2[p2]) {
                answer.add(arr[p]);
                p++; p2++;
            } else if(arr[p] < arr2[p2]){
                p++;
            } else {
                p2++;
            }
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }
}
