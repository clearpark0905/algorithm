package BOJ_algorithm.bronze;

import java.io.*;

public class Main_2839_sugarDelivery {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n/5; i++) { // 5kg 짜리 0개부터 n/5개까지 넣어보며 검사
            int cnt = 0;
            int temp = 0;
            if (i == 0) { // i가 0이면 5kg짜리가 0개
                if (n%3 != 0) continue; // 3으로 안나눠떨어지면 그냥 넘어감
                cnt = n / 3; //나누어 떨어지면 3으로 나눈 값이 cnt값
                if (min > cnt) { //현재 최소값보다 작으면 그 값을 최소값으로 함
                    min = cnt;
                    continue;
                }
            } else {
                temp = n-(i*5); // 5kg짜리를 i번 사용해서 남은 무게
                cnt = i; // 5kg짜리 i번 사용
                cnt += temp/3; // 남은 무게 3kg 짜리로 모두 사용
            }

            if (temp % 3 == 0) { // 나머지가 0이면 최소값 비교
                if ( min > cnt ) min = cnt;
                else continue;
            } // 0이 아니면 그냥 넘김
        }
        if (min == Integer.MAX_VALUE) // n 킬로그램 만들 수 없다면 -1 출력
            bw.write("-1");
        else
            bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();
    }
}
