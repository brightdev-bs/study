package algorithm.inflearn.ch4;

import java.util.HashMap;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        int len = s2.length() - 1;
        for(int i = 0; i < len; i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int lt = 0, answer = 0;
        for(int rt = len; rt < s1.length(); rt++) {
            map1.put(s1.charAt(rt), map1.getOrDefault(s1.charAt(rt), 0) + 1);
            if(map1.equals(map2)) answer++;
            map1.put(s1.charAt(lt), map1.getOrDefault(s1.charAt(lt), 0) - 1);
            if(map1.get(s1.charAt(lt)) <= 0) map1.remove(s1.charAt(lt));
            lt++;
        }
        System.out.println(answer);
    }
}
