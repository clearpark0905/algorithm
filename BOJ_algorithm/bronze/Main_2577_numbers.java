package BOJ_algorithm.bronze;

import java.io.*;

public class Main_2577_numbers {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int abcMul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        String[] abcArray = String.valueOf(abcMul).split("");
        int[] numbers = new int[10];

        for (String s : abcArray) {
            int i = Integer.parseInt(s);
            numbers[i]++;
        }

        for (int i = 0; i < 10; i++) {
            bw.write(numbers[i]+"\n");
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
