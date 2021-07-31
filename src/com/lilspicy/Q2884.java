package com.lilspicy;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int origH = sc.nextInt();
        int origM = sc.nextInt();

        int tmpH = origH * 60;
        int totM = tmpH + origM;
        int chaM = totM - 45;

        if (0 <= totM && totM <= 44) {
            chaM = totM + 1395;
        }
        int chatotH = chaM / 60;
        int chatotM = chaM % 60;
        System.out.print(chatotH + " ");
        System.out.println(chatotM);
    }
}
