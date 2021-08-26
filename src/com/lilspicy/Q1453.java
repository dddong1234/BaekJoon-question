package com.lilspicy;

import java.io.*;
import java.util.*;

public class Q1453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        st = new StringTokenizer(s);
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        List<Integer> list = Arrays.asList(arr);
        int num = Collections.max(list);
        int[] arr2 = new int[num];

        for (int i = 0; i < n; i++) {
            arr2[arr[i] - 1] += 1;
        }
        int tmp=0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 0) {
                continue;
            }
            tmp += arr2[i] - 1;
        }
        bw.write(Integer.toString(tmp));
        bw.flush();
        bw.close();
    }
}
