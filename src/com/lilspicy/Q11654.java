package com.lilspicy;

import java.io.*;

public class Q11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        bw.write(Integer.toString((int)s.charAt(0)));
        bw.flush();
        bw.close();
    }
}
