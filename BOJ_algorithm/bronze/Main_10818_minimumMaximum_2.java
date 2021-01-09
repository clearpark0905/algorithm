package BOJ_algorithm.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10818_minimumMaximum_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        int[] a = new int[num];
        st = new StringTokenizer(br.readLine(), " ");
        int i = 0;
        while (st.hasMoreTokens()) {
            a[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        Arrays.sort(a);
        bw.write(a[0] + " " + a[a.length - 1]);
        bw.flush();

        br.close();
        bw.close();

    }
}
/*
Buffer를 이용하여 데이터를 묶어서 이동시키면 훨씬 효율적이고 빠름
BufferedReader는 엔터만 경계로 인식하고 받은 데이터가 String으로 고정되기 때문에 데이터를 따로 가공해야함
사용자는 번거롭지만 실행속도는 빠름
 */