package BOJ_algorithm.silver;

import java.io.*;
import java.util.StringTokenizer;

public class Main_1978_searchPrimeNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] prime = new int[testCase];
        int cnt = 0;
        for (int i = 0; i < testCase; i++) {
            prime[i] = Integer.parseInt(st.nextToken());
            if (prime[i] == 1) continue;
            boolean sosu = true;
            for (int j = 2; j <= Math.sqrt(prime[i]); j++) {
                if (prime[i] % j == 0) {
                    sosu = false;
                    break;
                }
            }
            if (sosu) cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
