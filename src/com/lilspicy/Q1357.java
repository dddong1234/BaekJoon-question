package com.lilspicy;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        StringTokenizer st;
        s = br.readLine();
        st = new StringTokenizer(s);
        String s1 = st.nextToken();
        String s2 = st.nextToken();

        //수를 입력받아 한자리씩 배열에 등록
        Integer[] digit1 = new Integer[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            digit1[i] = s1.charAt(i) - '0';
        }
        Integer[] digit2 = new Integer[s2.length()];
        for (int i = 0; i < s2.length(); i++) {
            digit2[i] = s2.charAt(i) - '0';
        }

        //원본 배열을 리스트에 넣은후 reverse
        List<Integer> list1 = Arrays.asList(digit1);
        List<Integer> list2 = Arrays.asList(digit2);
        Collections.reverse(list1);
        Collections.reverse(list2);

        String tmp = Integer.toString(arrToInt(list1) + arrToInt(list2));

        Integer[] digit3 = new Integer[tmp.length()];
        for (int i = 0; i < tmp.length(); i++) {
            digit3[i] = tmp.charAt(i) - '0';
        }
        List<Integer> list3 = Arrays.asList(digit3);
        Collections.reverse(list3);
        bw.write(Integer.toString(arrToInt(list3)));
        bw.flush();
        bw.close();

    }
    //리스트에 있는 구성원을 숫자로 리턴
    private static int arrToInt(List<Integer> list) {
        int r=0;
        int m = 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            r += list.get(i) * m;
            m *= 10;
        }
        return r;
    }
}
