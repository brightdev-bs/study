package algorithm.inflearn.ch1;

import java.util.Scanner;

public class C12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        String answer="";
        for(int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            System.out.println(num);
            answer += (char) num;
            s = s.substring(7);
        }

        System.out.println(answer);
    }
}
