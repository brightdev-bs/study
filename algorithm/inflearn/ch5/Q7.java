package algorithm.inflearn.ch5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String conditions = sc.next();
        String course = sc.next();

        Queue<Character> queue = new LinkedList<>();
        for (char c: conditions.toCharArray()) {
            queue.add(c);
        }

        for (char c : course.toCharArray()) {
            if(queue.contains(c) && queue.peek() == c) {
                queue.poll();
            }
        }

        if(queue.isEmpty()) System.out.println("YES");
        else System.out.println("NO");


    }
}
