package com.lilspicy;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(s1);
        int n = Integer.parseInt(st1.nextToken());
        int x = Integer.parseInt(st1.nextToken());

        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        String s2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(s2);

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st2.nextToken()));
        }
        for (int i = 0; i < arr.size(); i++) {
            int y = arr.get(i);
            if (x > y) {
                arr2.add(y);
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < arr2.size(); i++) {
            bw.write(Integer.toString(arr2.get(i))+" ");
        }
        bw.flush();
        bw.close();
    }
}
