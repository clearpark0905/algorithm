package BOJ_algorithm.bronze;

import java.util.ArrayList;

public class Main_4673_SelfNumber {

    private static ArrayList noSelfNum;

    public static void main(String[] args) {
        makeNoSelfNum();
        for (int i = 0; i <= 10000; i++) {
            if (!hasGen(i)) {
                System.out.println(i);
            }
        }
    }

    public static void makeNoSelfNum() {
        noSelfNum = new ArrayList();

        for (int i = 0; i <= 10000; i++) {
            String num = String.valueOf(i);
            int no = 0;
            for (int j = 0; j < num.length(); j++) {
                no += Integer.parseInt(num.substring(j, j + 1));
            }
            noSelfNum.add(no + i);
        }
    }

    public static boolean hasGen(int num) {
        return noSelfNum.contains(num);
    }
}
