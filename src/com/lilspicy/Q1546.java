package com.lilspicy;

import java.io.*;
import java.util.StringTokenizer;

public class Q1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        int max = Integer.parseInt(st.nextToken());
        int sum = max;
        arr[0] = max;

        for (int i = 1; i < n; i++) {
            int comp = Integer.parseInt(st.nextToken());
            sum += comp;
            arr[i] = comp;
            if (max < comp) {
                max = comp;
            }

        }
        double answer = ((sum / (double)n) / max) * 100;
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
