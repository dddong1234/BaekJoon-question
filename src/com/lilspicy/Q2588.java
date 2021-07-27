package com.lilspicy;

import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int fst = b % 10;
        int sec = b % 100 / 10;
        int trd = b / 100;
        System.out.println(a * fst);
        System.out.println(a * sec);
        System.out.println(a * trd);
        System.out.println(a * b);
    }
}
