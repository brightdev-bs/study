package algorithm.inflearn.ch6;

import java.util.Arrays;
import java.util.Scanner;

// 결정 알고리즘 다시
public class Q9 {

    static int[] arr;
    static int n,m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int answer = 0;
        while(lt <= rt) {
            int middle = (lt + rt) / 2;
            int count = count(middle);
            if(count <= m) {
                rt = middle-1;
                answer = middle;
            } else {
                lt = middle+1;
            }
        }
        System.out.println(answer);
    }

    static int count(int middle) {
        int sum = 0;
        int cnt = 1;
        for(int i = 0; i < arr.length; i++) {
            if(sum + arr[i] <= middle) sum += arr[i];
            else {
                cnt++;
                sum = arr[i];
            }
        }
        return cnt;
    }
}
