package BOJ_algorithm.bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_3052_remainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt()%42;
        }

        ArrayList alist = new ArrayList();
        for (int i = 0; i < num.length; i++) {
            if (!alist.contains(num[i])) {
                alist.add(num[i]);
            }
        }

        System.out.println(alist.size());


    }
}
