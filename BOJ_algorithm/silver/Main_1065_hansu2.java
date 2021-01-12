package BOJ_algorithm.silver;

import java.io.*;

public class Main_1065_hansu2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // 입력받은 n
        int hansuCount = 0; // 한수의 개수를 저장하는 변수

        // 한수임을 체크하는 함수로 1부터 n까지 검사
        for (int i = 1; i <= n; i++) {
            hansuCount += isHansu(i);
        }

        if (hansuCount > n) System.exit(1); // 검사 실패 시 비정상 종료
        bw.write(String.valueOf(hansuCount));
        bw.flush();

        br.close();
        bw.close();

    }

    // 한수면 1, 한수가 아니라면 0을 반환해주는 함수
    public static int isHansu(int number) {
        if(number < 100) return 1; // 1~99까지 모두 한수므로 1반환
        String[] str = String.valueOf(number).split(""); // 숫자를 배열에 넣음
        int[] temp = new int[str.length]; // 등차인지 확인하는 배열

        //한수 검사. 자릿수-1 만큼 검사
        for (int i = 0; i <= str.length-2; i++) {
            temp[i] = Integer.valueOf(str[i]) - Integer.valueOf(str[i+1]); // 자릿수 간 얼마 차이인지 계산
            if (i==0) continue; // 첫번째 자리는 (비교 대상이 없으니) 일단 continue
            else if (temp[i-1] != temp[i]) return 0; // 등차가 아니라면 0을 반환
            else if (i == str.length-2) return 1; // 마지막 검사까지 등차라면 1을 반환
        }
        return number+1; // 검사 실패 시 number보다 큰 수 반환
    }
}
