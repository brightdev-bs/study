package algorithm.inflearn.ch8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 최적화에서 틀림 ㅠ..
public class Q5 {

    static Integer[] arr;
    static int n,m, answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 동전의 종류
        arr = new Integer[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        m = sc.nextInt(); // 거슬러줄 금액
        DFS(0,0);
        System.out.println(answer);
    }

    public static void DFS(int L, int sum){
        if(L >= answer) return;
        if(sum > m) return;
        if(sum == m) {
            answer = Math.min(L, answer);
            return;
        } else {
            for(int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i]);
            }
        }
    }
}
