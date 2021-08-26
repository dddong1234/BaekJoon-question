package com.lilspicy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2822 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 8; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        List<Integer> list2 = new ArrayList<Integer>(list);
        Collections.sort(list2);
        int score = 0;
        List<Integer> list3 = new ArrayList<Integer>();
        for (int i = 7; i > 2; i--) {
            score += list2.get(i);
            list3.add(list.indexOf(list2.get(i))+1);
        }
        Collections.sort(list3);
        bw.write(Integer.toString(score) + "\n");
        for (Integer integer : list3) {
            bw.write(Integer.toString(integer) + " ");
        }
        bw.flush();
        bw.close();
    }
}
