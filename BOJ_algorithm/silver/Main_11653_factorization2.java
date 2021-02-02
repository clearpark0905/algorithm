package BOJ_algorithm.silver;

import java.util.Scanner;

public class Main_11653_factorization2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i);
                n /= i;
                continue;
            }
            i++;
        }
        sc.close();
    }
}
