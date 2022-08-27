package algorithm.inflearn.ch1;

import java.util.Scanner;

public class C5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();

        int lt = 0, rt = s.length() - 1;
        while(lt < rt) {
            if(!Character.isAlphabetic(arr[lt])) lt++;
            else if(!Character.isAlphabetic(arr[rt])) rt--;
            else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        System.out.println(arr);

    }
}
