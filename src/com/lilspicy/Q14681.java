package com.lilspicy;

import java.util.Scanner;

public class Q14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(classifyQuadrant(x, y));
    }

    static int classifyQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x > 0 && y < 0) {
            return 4;
        } else if (x < 0 && y > 0) {
            return 2;
        } else {
            return 3;
        }
    }
}
