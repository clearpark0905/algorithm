package BOJ_algorithm.bronze;

import java.util.Scanner;

public class Main_8958_oxQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        sc.nextLine();
        String[] caseStr = new String[caseNum];

        for (int i = 0; i < caseNum; i++) {
            caseStr[i] = sc.nextLine();
        }

        int[] score = new int[caseNum];

        for (int i = 0; i < caseNum; i++) {
            String[] str = caseStr[i].split("");
            score[i] = 0;
            int weight = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("O")) {
                    weight += 1;
                    score[i] += weight;
                    continue;
                } else if (str[j].equals("X")) {
                    weight = 0;
                    continue;
                }
            }
        }

        for (int i = 0; i < caseNum; i++) {
            System.out.println(score[i]);
        }
    }
}
