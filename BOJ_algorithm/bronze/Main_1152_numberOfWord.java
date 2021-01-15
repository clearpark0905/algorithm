package BOJ_algorithm.bronze;

import java.io.*;

public class Main_1152_numberOfWord {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().trim().split(" ");
        if (str[0].equals(""))
            bw.write(String.valueOf(0));
        else
            bw.write(String.valueOf(str.length));
        bw.flush();
        br.close();
        bw.close();
    }
}
