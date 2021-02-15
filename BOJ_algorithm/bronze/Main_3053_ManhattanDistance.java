package BOJ_algorithm.bronze;

import java.util.Scanner;

public class Main_3053_ManhattanDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        System.out.printf("%6f\n",r*r*3.141592653589793238);
        System.out.printf("%6f",2*r*r);
        sc.close();
    }
}
