package com.lilspicy;

public class Q15596 {

    static long sum(int[] a) {
        int tmp = 0;
        for (int i = 0; i < a.length; i++) {
            tmp += a[i];
        }
        return tmp;
    }
}
