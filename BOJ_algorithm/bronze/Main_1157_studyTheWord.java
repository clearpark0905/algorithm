package BOJ_algorithm.bronze;

import java.io.*;

public class Main_1157_studyTheWord {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().toLowerCase().split("");
        br.close();
        int[] count = new int[26];

        for (int i = 0; i < str.length; i++) {
            char ch = str[i].charAt(0);
            count[(int) ch - 97]++;
        }

        int max = -1;
        int maxIndex = 99999;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) continue;
            if (max < count[i]) {
                max = count[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (maxIndex == i) continue;
            else if (count[maxIndex] == count[i]) {
                bw.write("?");
                bw.flush();
                bw.close();
                System.exit(0);
            }
        }

        String a = String.valueOf((char)(maxIndex+97)).toUpperCase();
        bw.write(a);
        bw.flush();
        bw.close();
    }
}
