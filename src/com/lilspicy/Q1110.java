package com.lilspicy;

import java.util.Scanner;

public class Q1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int origin = sc.nextInt();
        int newNum = makeNewNumber(origin);
        while (true) {
            if (origin == 0) {
                break;
            }

            newNum = makeNewNumber(newNum);
            num++;

            if (newNum == origin) {
                break;
            }


        }
        System.out.println(num);

    }

    static int getRight(int num) {
        return num % 10;
    }

    static int getLeft(int num) {
        return num / 10;
    }

    static int makeNewNumber(int num) {
        int a = getLeft(num);
        int b = getRight(num);
        return b * 10 + getRight(a + b);
    }
}
