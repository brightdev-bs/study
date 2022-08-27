package algorithm.inflearn.ch1;

import java.util.ArrayList;
import java.util.Scanner;

// 인강에서는  ----------------------> 이 방향으로 한 번 쭉 서칭하고
//          <---------------------- 이렇게 다시 서칭하면서 최소값으로 업데이트함.
public class C10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char t = sc.next().charAt(0);

        char[] arr = s.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(arr[i] == t) list.add(i);
        }

        for(int i = 0; i < s.length(); i++) {
            int answer = Integer.MAX_VALUE;
            if(arr[i] == t) {
                System.out.print(0 + " ");
                continue;
            }
            for(int idx : list) {
                int tmp = Math.abs(idx - i);
                answer = Math.min(answer, tmp);
            }

            System.out.print(answer + " ");
        }
    }
}
