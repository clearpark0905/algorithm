package BOJ_algorithm.bronze;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main_4673_SelfNumber2 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList arrayList = new ArrayList();

        for (int i = 1; i <= 10000; i++) {
            arrayList.add(d(i));
        }

        for (int i = 1; i <= 10000; i++) {
            if (arrayList.contains(i))
                continue;
            else
                bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static int d(int num) {
        int sum = 0;
        int tempNum = num;
        for (int i = 0; i < (int)(Math.log10(num)+1); i++) {
            sum += tempNum%10;
            tempNum /= 10;
        }
        return num + sum;
    }
}
