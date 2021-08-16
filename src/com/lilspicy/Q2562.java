package com.lilspicy;

import java.io.*;

public class Q2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tmp = 0;
        int tmp3 = 0;
        int max = Integer.parseInt(br.readLine());
        while (tmp < 8) {
            int tmp2 = Integer.parseInt(br.readLine());
            tmp++;
            if (max < tmp2) {
                max = tmp2;
                tmp3 = tmp;
            }

        }
        bw.write(Integer.toString(max) + "\n" + Integer.toString(tmp3+1));
        bw.flush();
        bw.close();
    }
}
