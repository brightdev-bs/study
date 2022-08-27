package algorithm.inflearn.ch5;

import java.util.Scanner;
import java.util.Stack;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if(c == '(') stack.push(c);
            else {
                if(stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
        }

        if(stack.isEmpty()) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");

    }
}
