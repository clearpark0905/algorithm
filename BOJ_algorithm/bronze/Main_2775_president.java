package BOJ_algorithm.bronze;

import java.io.*;

public class Main_2775_president {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCnt = Integer.parseInt(br.readLine());
        int[] k = new int[testCnt];
        int[] n = new int[testCnt];

        int max = 0;
        for (int i = 0; i < testCnt; i++) {
            k[i] = Integer.parseInt(br.readLine());
            n[i] = Integer.parseInt(br.readLine());
            if (max < k[i])
                max = k[i];
        }

        int[][] apart = new int[max+1][14]; // max는 최고층수, 13은 최대 호수
        for (int i = 0; i <= max; i++) { //층수
            if (i == 0)
                for (int j = 0; j < 14; j++) { //호수
                    apart[i][j] = j+1;
                }
            else
                for (int j = 0; j < 14 ; j++) {
                    if (j == 0) {
                        apart[i][j] = 1;
                        continue;
                    }
                    apart[i][j] = apart[i-1][j] + apart[i][j-1];
                }
        }

        for (int i = 0; i < testCnt; i++) {
            bw.write(String.valueOf(apart[k[i]][n[i] - 1]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
