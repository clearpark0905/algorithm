package BOJ_algorithm.bronze;

import java.io.*;
import java.util.ArrayList;

public class Main_10809_findAlphabet {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] word = br.readLine().split("");
        ArrayList arrayList = new ArrayList();
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        int[] alphabetLoc = new int[alphabet.length];

        for (String temp : word)
            arrayList.add(temp);

        for (int i = 0; i < alphabet.length; i++) {
            if(arrayList.contains(alphabet[i]))
                alphabetLoc[i] = arrayList.indexOf(alphabet[i]);
            else if(!arrayList.contains(alphabet[i]))
                alphabetLoc[i] = -1;
        }

        for (int temp:alphabetLoc)
            bw.write(temp + " ");

        bw.flush();
        br.close();
        bw.close();
    }
}
