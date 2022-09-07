package algorithm.inflearn.ch8;

import java.util.Scanner;

public class Q7 {

    static int n,r;
    static int[][] memory = new int[34][34];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        r = sc.nextInt();

        System.out.println(DFS(n, r));
    }

    public static int DFS(int a, int b) {
        if(memory[a][b] != 0) return memory[a][b];
        if(b == 1) return a;
        if(a == b) return 1;
        return memory[a][b] = DFS(a-1, b-1) + DFS(a-1, b);
    }
}
