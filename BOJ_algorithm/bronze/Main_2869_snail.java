package BOJ_algorithm.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Main_2869_snail {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        double v = Integer.parseInt(st.nextToken());

        double num = ((v-b)/(a-b))%1;
        if ( num == 0 ) bw.write(String.valueOf((int) ((v-b)/(a-b))));
        else bw.write(String.valueOf((int) ((v-b)/(a-b) + 1)));

        bw.flush();
        bw.close();
        br.close();

    }
}
