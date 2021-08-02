package com.lilspicy;

import java.io.*;

public class Q2741_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            bw.write(String.valueOf(i)+"\n");
        }
        bw.close();
    }
}
