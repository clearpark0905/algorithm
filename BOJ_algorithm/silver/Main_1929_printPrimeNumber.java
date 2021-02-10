package BOJ_algorithm.silver;

import java.util.Scanner;

public class Main_1929_printPrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
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
                System.out.println(i);
            }
        }
        sc.close();
    }
}
