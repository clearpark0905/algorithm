package BOJ_algorithm.silver;

import java.io.*;
import java.util.StringTokenizer;

public class Main_1011_flyMeToTheAlphaCentauri {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int maxSpeed = (int) Math.sqrt(y-x);
            int maxDistance = maxSpeed*maxSpeed;
            int warfCnt = 2*maxSpeed - 1;

            int remainder = (y-x) - maxDistance;
            warfCnt += (int) Math.ceil((double) remainder / maxSpeed);

            bw.write(String.valueOf(warfCnt));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
