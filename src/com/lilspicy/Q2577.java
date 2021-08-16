package com.lilspicy;

import java.io.*;
import java.util.Arrays;

public class Q2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = 1;
        for (int i = 0; i < 3; i++) {
            num *= Integer.parseInt(br.readLine());
        }
        int[] arr = new int[10];
        String temp=Integer.toString(num);
        int[] orgNum = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            arr[temp.charAt(i) - '0']++;
        }
        for (int i : arr) {
            bw.write(Integer.toString(i)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
