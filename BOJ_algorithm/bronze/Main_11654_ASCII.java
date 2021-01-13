package BOJ_algorithm.bronze;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main_11654_ASCII {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        byte[] b = a.getBytes("US-ASCII");
        System.out.println(b[0]);
        sc.close();
    }
}

//public class Main_11654_ASCII {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
//        System.out.println(input.hashCode());
//    }
//}