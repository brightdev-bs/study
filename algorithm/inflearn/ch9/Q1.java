package algorithm.inflearn.ch9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q1 {

    public static class Candidate{
        int height, weight;

        public Candidate(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Candidate[] arr = new Candidate[n];
        for(int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr[i] = new Candidate(h,w);
        }

        Arrays.sort(arr, (o1, o2) ->  {
            if(o1.height == o2.height) return o2.weight-o1.weight;
            else return o2.height-o1.height;
        });

        int answer = 1;
        for(int i = 1; i < n; i++) {
            boolean flag = true;
            for(int j = 0; j < i; j++) {
                if(arr[i].weight < arr[j].weight) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
        }

        System.out.println(answer);

    }
}
