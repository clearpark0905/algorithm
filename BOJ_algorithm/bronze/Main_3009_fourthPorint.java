package BOJ_algorithm.bronze;

import java.util.Scanner;

public class Main_3009_fourthPorint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        System.out.println(fourth(x) + " " + fourth(y));
        sc.close();
    }

    public static int fourth(int[] n) {
        if (n[0] != n[1] && n[0] != n[2]) return n[0];
        else if (n[1] != n[0] && n[1] != n[2]) return n[1];
        else return n[2];
    }
}
