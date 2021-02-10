package BOJ_algorithm.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main_4948_Bertrand {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        ArrayList testCase = new ArrayList();
        while (num != 0) {
            testCase.add(num);
            num = Integer.parseInt(br.readLine());
        }

        Iterator it = testCase.iterator();
        while (it.hasNext()) {
            int firstNum = Integer.parseInt(String.valueOf(it.next()));
            int primeCnt = 0;
            for (int i = firstNum+1; i <= 2*firstNum; i++) {
                if (i <= 1) continue;
                Boolean sosu = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        sosu = false;
                        break;
                    }
                }
                if (sosu)
                    primeCnt++;
            }
            bw.write(primeCnt + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
