package algorithm.inflearn.ch4;

import java.util.HashMap;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char answer = ' ';
        int max = Integer.MIN_VALUE;
        for (Character character : map.keySet()) {
            Integer integer = map.get(character);
            if(max < integer) {
                max = integer;
                answer = character;
            }
        }

        System.out.println(answer);
    }
}
