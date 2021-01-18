package BOJ_algorithm.bronze;

import java.io.*;

public class Main_2908_sangsu {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int[] num = new int[str.length];
        int max = -1;
        for (int i = 0; i < str.length; i++) {
            int temp = Integer.parseInt(str[i]);
            num[i] = (temp%10)*100 + ((temp%100)/10)*10 + (temp/100);
            if (max < num[i]) max = num[i];
        }
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }
}
