package algorithm.inflearn.ch4;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (Character c : map.keySet()) {
            if(map.get(c) != map2.getOrDefault(c, -1)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
