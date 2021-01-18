package BOJ_algorithm.silver;

import java.io.*;

public class Main_2941_CroatiaAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split("");

        int temp=0;
        for (int i = 0; i < str.length; i++) {
            if (i == 0) continue;
            if (str[i].equals("=")) {
                if (str[i - 1].equals("c")) {
                    temp += 1;
                    continue;
                }
                if (str[i - 1].equals("s")) {
                    temp += 1;
                    continue;
                }
                if (str[i - 1].equals("z")) {
                    temp += 1;
                    if (i == 1) continue;
                    else if (str[i - 2].equals("d")) {
                        temp += 1;
                        continue;
                    }
                    continue;
                }
            }
            if (str[i].equals("-")) {
                if (str[i - 1].equals("c")) {
                    temp += 1;
                    continue;
                }
                if (str[i - 1].equals("d")) {
                    temp += 1;
                    continue;
                }
            }
            if (str[i].equals("j")) {
                if (str[i - 1].equals("l")) {
                    temp += 1;
                    continue;
                }
                if (str[i - 1].equals("n")) {
                    temp += 1;
                    continue;
                }
            }
        }

        bw.write(String.valueOf(str.length - temp));
        bw.flush();
        bw.close();
        br.close();

    }
}
