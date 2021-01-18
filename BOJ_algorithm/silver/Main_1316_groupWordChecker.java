package BOJ_algorithm.silver;

import java.io.*;
import java.util.ArrayList;

public class Main_1316_groupWordChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split("");
            ArrayList strList = new ArrayList(str.length);
            Boolean judge = true;
            for (int j = 0; j < str.length; j++) {
                if (!strList.contains(str[j])) {
                    strList.add(str[j]);
                    continue;
                } else {
                    if (str[j].equals(str[j-1])) continue;
                    judge = false;
                    break;
                }
            }
            if (judge == true) count += 1;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
