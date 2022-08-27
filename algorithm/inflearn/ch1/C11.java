package algorithm.inflearn.ch1;

import java.util.Scanner;

// charAt()을 사용해서 charAt(idx) charAt(idx+1) 비교하게 되면 결국 마지막에 indexOutOf 에러가 뜬다.
// 따라서 추가적인 코드를 적기보다는 String s에 빈 문자열을 하나 추가해주면 편리하다.
public class C11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String s = sc.next();
        s = s + " ";

        int cnt = 1;
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) cnt++;
            else {
                sb.append(s.charAt(i));
                if(cnt > 1) sb.append(cnt);
                cnt = 1;
            }
        }

        System.out.println(sb);
    }
}
