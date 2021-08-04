package com.lilspicy;

import java.io.*;
import java.util.StringTokenizer;

public class Q10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String s;

        while ((s = br.readLine()) != null) {
            st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(Integer.toString(a + b) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
