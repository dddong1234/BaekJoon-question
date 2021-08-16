package com.lilspicy;

import java.io.*;

public class Q8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int score = 0;
            int plus = 0;
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    plus++;
                    score += plus;
                } else {
                    plus = 0;
                }
            }
            bw.write(Integer.toString(score)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
