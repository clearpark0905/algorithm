package BOJ_algorithm.bronze;

import java.io.*;

public class Main_1712_breakEvenPoint {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] abc = br.readLine().split(" ");
        long a = Long.parseLong(abc[0]);
        long b = Long.parseLong(abc[1]);
        long c = Long.parseLong(abc[2]);

        if (c <= b) {
            bw.write(String.valueOf(-1));
        } else {
            Long i = a/(c-b) + 1;
            bw.write(String.valueOf(i));
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
