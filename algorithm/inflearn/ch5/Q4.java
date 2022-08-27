package algorithm.inflearn.ch5;

import java.util.Scanner;
import java.util.Stack;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String s = sc.next();
        Stack<Integer> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)) stack.push(c - '0');
            else {
                int a = stack.pop();
                int b = stack.pop();
                if(c == '+') stack.push(a+b);
                else if(c == '-') stack.push(b-a);
                else if(c == '*') stack.push(a*b);
                else if(c == '/') stack.push(b / a);
            }
        }
        System.out.println(stack.pop());


    }
}
