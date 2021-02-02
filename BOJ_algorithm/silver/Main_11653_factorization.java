package BOJ_algorithm.silver;

import java.io.*;

public class Main_11653_factorization {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                bw.write(String.valueOf(i));
                bw.newLine();
                n /= i;
                continue;
            }
            i++;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
