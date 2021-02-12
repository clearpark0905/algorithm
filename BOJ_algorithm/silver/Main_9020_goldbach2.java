package BOJ_algorithm.silver;

import java.io.*;

public class Main_9020_goldbach2 {
    static int[] isPrime = prime();

    public static int[] prime() {
        int[] ints = new int[10001]; //2부터 시작하니까 index+2 해줘야함
        ints[0] = 1; ints[1] = 1;
        for (int i = 2; i < ints.length; i++) {
            if (ints[i] == 1) continue;
            for (int j = i+i; j < 10000; j += i) {
                ints[j] = 1;
            }
        }
        return ints;
    }

    public static String goldbach(int num) {
        int index1 = -1, index2 = -1, temp = Integer.MAX_VALUE;
        for (int i = 2; i <= num/2; i++) {
            if (isPrime[i] == 1) continue;
            if (isPrime[num-i] == 0) {
                if(temp > (num-i) - i) {
                    index1 = i;
                    index2 = num-i;
                    temp = index2 - index1;
                }
            }
        }
        return index1 + " " + index2 + "\n";

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(goldbach(n));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
