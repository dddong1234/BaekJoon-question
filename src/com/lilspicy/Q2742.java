package com.lilspicy;

import java.io.*;

public class Q2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = t; i > 0; i--) {
            bw.write(Integer.toString(i)+"\n");
        }
        bw.close();
    }
}
