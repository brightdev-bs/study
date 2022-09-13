package algorithm.inflearn.ch10;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

    static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        dy = new int[n];
        dy[0] = 1;
        for(int i = 1; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && max < dy[j]) {
                    max = dy[j] + 1;
                }
            }
            dy[i] = max;
        }

        int answer = Arrays.stream(dy).max().getAsInt();
        System.out.println(answer);
    }
}
