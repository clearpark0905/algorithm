package BOJ_algorithm.silver;

import java.util.Scanner;

public class Main_2581_primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int min = n;
        int sum = 0;
        for (int i = m; i <= n ; i++) {
            if (i <= 1) continue;
            boolean sosu = true;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    sosu = false;
                    break;
                }
            }
            if (sosu) {
                sum += i;
                if (min > i) min = i;
            }
        }
        if (sum == 0) System.out.println(-1);
        else System.out.println(sum + "\n" + min);
        sc.close();
    }
}
