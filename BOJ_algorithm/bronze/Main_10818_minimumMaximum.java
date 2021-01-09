package BOJ_algorithm.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Main_10818_minimumMaximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        System.out.println(a[0] + " " + a[a.length - 1]);
        sc.close();
    }
}
