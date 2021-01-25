package BOJ_algorithm.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Main_10250_ACMhotel {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken()); //층
            int w = Integer.parseInt(st.nextToken()); //방개수
            int n = Integer.parseInt(st.nextToken()); //n번째 손님

            int front = n % h; //방 번호 앞자리
            int rear = n / h + 1; //방 번호 뒷자리

            if (front == 0) {
                if (rear-1 < 10)
                    bw.write(h+ "0" + (rear-1));
                else
                    bw.write(String.valueOf(h) + String.valueOf(rear-1));
            } else {
                if (rear < 10)
                    bw.write(front +"0"+ rear);
                else
                    bw.write(String.valueOf(front) + String.valueOf(rear));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
