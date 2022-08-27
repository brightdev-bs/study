package algorithm.inflearn.ch2;

import java.util.*;

public class C11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int answer = -1;
        for(int student = 1; student <= n; student++) {
            int cnt = 0;
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= 5; j++) {
                    if(arr[student][j] == arr[i][j]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = student;
            }
        }
        System.out.println(answer);
    }
}
