package BOJ_algorithm.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1546_fakeAverage {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int itemNum = Integer.parseInt(br.readLine());
        double[] rawScores = new double[itemNum];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < itemNum; i++) {
            rawScores[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(rawScores);
        double highScore = rawScores[rawScores.length-1];
        double sum = 0;
        for (int i = 0; i < rawScores.length; i++) {
            rawScores[i] = (rawScores[i]/highScore)*100;
            sum += rawScores[i];
        }

        bw.write(String.valueOf(sum/itemNum));
        bw.flush();

        br.close();
        bw.close();

    }
}
