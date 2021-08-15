package com.lilspicy;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String s;

        int c = Integer.parseInt(bf.readLine());
        for (int i = 0; i < c; i++) {
            s = bf.readLine();
            st = new StringTokenizer(s);
            int totalSum = 0;
            int avg;

            int[] test = new int[Integer.parseInt(st.nextToken())];

            for (int j = 0; j < test.length; j++) {
                test[j] = Integer.parseInt(st.nextToken());
                totalSum += test[j];
            }
            avg = totalSum / test.length;

            ArrayList<Integer> arr = new <Integer>ArrayList();
            for (int j = 0; j < test.length; j++) {
                if (test[j] > avg) {
                    arr.add(test[j]);
                }
            }
            bw.write(String.format("%.3f",((double) arr.size()/(double)test.length)*100)+"%"+"\n");
        }
        bw.flush();
        bw.close();
    }
}
