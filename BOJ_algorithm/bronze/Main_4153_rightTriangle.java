package BOJ_algorithm.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Main_4153_rightTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while (true) {
            String str = br.readLine();
            if (str.equals("0 0 0")) break;
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (isRightTriangle(a,b,c)) bw.write("right\n");
            else bw.write("wrong\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
    public static boolean isRightTriangle(int a, int b, int c) {
        switch (a>b ? (a>c ? 0:2) : (b>c ? 1:2)) {
            case 0:
                if (a*a == b*b + c*c) return true;
                else return false;
            case 1:
                if (b*b == a*a + c*c) return true;
                else return false;
            case 2:
                if (c*c == b*b + a*a) return true;
                else return false;
        }
        return false;
    }
}
