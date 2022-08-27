package algorithm.inflearn.ch2;

import java.util.Scanner;

public class C8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] answer = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            int cnt = 1;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
