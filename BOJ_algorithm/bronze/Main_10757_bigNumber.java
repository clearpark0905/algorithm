package BOJ_algorithm.bronze;

import java.util.Scanner;

public class Main_10757_bigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextBigInteger().add(sc.nextBigInteger()).toString());
        sc.close();
    }
}
