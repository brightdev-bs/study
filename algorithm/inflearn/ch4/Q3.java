package algorithm.inflearn.ch4;

import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] inputs = new int[n];
        for(int i = 0; i < n; i++) {
            inputs[i] = sc.nextInt();
        }

        int lt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < k; i++) {
            map.put(inputs[i], map.getOrDefault(inputs[i], 0) + 1);
        }

        System.out.print(map.size() + " ");
        for(int i = k; i < n; i++) {
            if(map.get(inputs[lt]) != 1) {
                map.put(inputs[lt], map.get(inputs[lt]) - 1);
            } else {
                map.remove(inputs[lt]);
            }
            map.put(inputs[i], map.getOrDefault(inputs[i], 0) + 1);
            System.out.print(map.size() + " ");
            lt++;
        }


    }
}
