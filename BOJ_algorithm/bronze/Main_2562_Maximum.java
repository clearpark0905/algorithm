package BOJ_algorithm.bronze;

import java.util.Scanner;

public class Main_2562_Maximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int maxValue=0;
        int maxValueIndex=0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if(num[i] > maxValue){
                maxValue = num[i];
                maxValueIndex = i+1;
            }
        }
        System.out.println(maxValue);
        System.out.println(maxValueIndex);
        sc.close();
    }
}
