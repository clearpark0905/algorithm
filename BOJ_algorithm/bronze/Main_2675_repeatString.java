package BOJ_algorithm.bronze;

import java.io.*;

public class Main_2675_repeatString {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];

        for (int i = 0; i < n; i++)
            s[i] = br.readLine();

        for (int i = 0; i < n; i++) {
            String[] str = s[i].split("");
            for (int j = 2; j < str.length; j++)
                for (int k = 0; k < Integer.parseInt(str[0]); k++)
                    bw.write(str[j]);
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
