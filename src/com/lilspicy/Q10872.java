package com.lilspicy;

import java.io.*;

public class Q10872 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(Integer.toString(factorial(n)));
        bw.flush();
        bw.close();
    }
    public static int factorial(int a) {
        if (a == 1) {
            return a;
        } else if (a == 0) {
            return 1;
        } else {
            return factorial(a - 1) * a;
        }
    }
}
