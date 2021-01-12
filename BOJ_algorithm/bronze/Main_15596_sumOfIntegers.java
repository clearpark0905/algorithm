package BOJ_algorithm.bronze;

import java.util.Scanner;

public class Main_15596_sumOfIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        Main_15596_sumOfIntegers test = new Main_15596_sumOfIntegers();
        System.out.println(test.sum(a));

    }

    public long sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
