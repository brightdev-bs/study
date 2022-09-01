package algorithm.inflearn.ch7;

import java.nio.file.Path;
import java.util.Scanner;

public class Q10 {
    static int[] ch;
    static int[][] graph;
    static int n,m, cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 정점의 수
        m = sc.nextInt(); // 간선의 수

        ch = new int[n+1];
        graph = new int[n+1][n+1];
        for(int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        DFS(1);
        System.out.println(cnt);
    }

    public static void DFS(int current) {
        if(current == n) {
            cnt++;
        } else {
            for(int i=1; i<=n; i++){
                if(graph[current][i]==1 && ch[i]==0){
                    ch[i]=1;
                    DFS(i);
                    ch[i]=0;
                }
            }
        }

    }
}
