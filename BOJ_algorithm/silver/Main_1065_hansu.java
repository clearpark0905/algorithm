package BOJ_algorithm.silver;

import java.util.Scanner;

public class Main_1065_hansu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hansuCount = 0;

        for (int i = 1; i <= n; i++) {
            String[] str = String.valueOf(i).split("");
            int position = str.length;
            int[] temp = new int[position];
            if (i < 100) {
                hansuCount++;
                continue;
            }

            for (int j = 0; j <= position-2; j++) {
                temp[j] = Integer.parseInt(str[j]) - Integer.parseInt(str[j+1]);
                if (j==0) continue;
                else if (temp[j-1] != temp[j]) break;
                else if (j == position-2) {
                    hansuCount++;
                    break;
                }
            }
        }
        System.out.println(hansuCount);

    }
}
