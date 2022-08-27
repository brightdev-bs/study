package algorithm.inflearn.ch5;

import java.util.Scanner;
import java.util.Stack;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else if(c == ')') {
                stack.pop();
            } else if(stack.isEmpty()) {
                sb.append(c);
            }
        }

        System.out.println(sb);
    }
}
