package algorithm.inflearn.ch1;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class C3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int m = Integer.MIN_VALUE;
        String answer = "";
        String[] s = str.split(" ");
        for(String x : s) {
            int len = x.length();
            if(len > m) {
                m = len;
                answer = x;
            }
        }
        System.out.println(answer);
    }

    public static String solution2(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length() > m) answer = str;
        return answer;
    }
}
