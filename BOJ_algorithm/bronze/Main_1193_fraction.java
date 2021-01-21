package BOJ_algorithm.bronze;

import java.io.*;

public class Main_1193_fraction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        boolean course = true; //true면 대각선 아래로 내려감
        int x = 1;
        int y = 1;
        int j = 1;
        for (int i = 1; i < n; i++) {
            j--;
            if (x == 1 && j == 0) {
                y++;
                j = x + y - 1;
                course = true;
                continue;
            } else if (y == 1 && j == 0) {
                x++;
                j = x + y - 1;
                course = false;
                continue;
            }
            if (course) {
                x++;
                y--;
                continue;
            } else {
                x--;
                y++;
                continue;
            }
        }

        bw.write(x + "/" + y);
        bw.flush();
        bw.close();
        br.close();
    }
}
