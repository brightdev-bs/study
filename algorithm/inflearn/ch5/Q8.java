package algorithm.inflearn.ch5;

import java.util.*;

public class Q8 {

    static class Person {
        int idx;
        int emergency;

        public Person(int idx, int emergency) {
            this.idx = idx;
            this.emergency = emergency;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Queue<Person> queue = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            int input = sc.nextInt();
            queue.add(new Person(i, input));
        }

        int cnt = 0;
        while (!queue.isEmpty()) {
            Person p = queue.poll();
            boolean flag = true;
            for (Person person : queue) {
                if(p.emergency < person.emergency) {
                    queue.add(p);
                    flag = false;
                    break;
                }
            }

            if(flag) {
                cnt++;
                if(p.idx == m) System.out.println(cnt);
            }
        }
    }
}
