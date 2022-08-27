package algorithm.inflearn.ch5;

import java.util.Scanner;
import java.util.Stack;

// 다시 풀기 8.24
public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '(') stack.push(arr[i]);
            else {
                stack.pop();
                if(arr[i-1] == '(') sum += stack.size();
                else sum++;
            }
        }


        System.out.println(sum);

    }
}
