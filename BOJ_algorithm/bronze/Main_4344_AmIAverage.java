package BOJ_algorithm.bronze;

import java.io.*;

public class Main_4344_AmIAverage {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());
        double[] avgRate = new double[caseNum];

        for (int i = 0; i < caseNum; i++) {
            String[] str = br.readLine().split(" ");
            int scoreCase = Integer.parseInt(str[0]);
            int[] score = new int[scoreCase];
            int sum = 0;
            for (int j = 1; j < str.length; j++) {
                sum += Integer.parseInt(str[j]);
                score[j - 1] = Integer.parseInt(str[j]);
            }
            double avg = sum/scoreCase;
            int avgUp = 0;
            for (int j = 0; j < scoreCase; j++) {
                if (score[j] > avg) avgUp++;
                else continue;
            }
            avgRate[i] = (avgUp/(double)scoreCase)*100;
            bw.write(String.format("%.3f%%\n", avgRate[i]));
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
