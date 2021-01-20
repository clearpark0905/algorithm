package BOJ_algorithm.bronze;

import java.util.Scanner;

public class Main_2292_hive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int j=1;
        while (true) {
            if (i < n) {
                i += 6 * j;
                j++;
                continue;
            } else {
                break;
            }
        }
        System.out.println(j);
    }
}
