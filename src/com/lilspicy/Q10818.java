package com.lilspicy;


import java.io.*;
import java.util.StringTokenizer;

public class Q10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String s;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        s = br.readLine();
        st = new StringTokenizer(s);
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int tmp = arr[0];
        int tmp2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (tmp < arr[i]) {
                tmp = arr[i];
            }
            if (tmp2 > arr[i]) {
                tmp2 = arr[i];
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(tmp2) + " " + Integer.toString(tmp));
        bw.flush();
        bw.close();
    }

}
