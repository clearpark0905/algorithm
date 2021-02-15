package BOJ_algorithm.bronze;

import java.util.Scanner;

public class Main_1085_escapeFromRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        if (w/2 >= x && h/2 >= y)
            if (x > y) System.out.println(y);
            else System.out.println(x);
        else if (w/2 >= x)
            if (x > h-y) System.out.println(h-y);
            else System.out.println(x);
        else if (h/2 >= y)
            if (w-x > y) System.out.println(y);
            else System.out.println(w-x);
        else
            if ((w-x) > (h-y)) System.out.println((h-y));
            else System.out.println((w-x));

        sc.close();
    }
}
