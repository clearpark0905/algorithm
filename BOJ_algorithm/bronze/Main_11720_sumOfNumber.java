package BOJ_algorithm.bronze;

import java.io.*;

public class Main_11720_sumOfNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String[] numstr = br.readLine().split("");
        int sum=0;

        for (int i = 0; i < numstr.length; i++)
            sum += Integer.parseInt(numstr[i]);

        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
        bw.close();
    }
}
