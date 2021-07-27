package com.lilspicy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Math;
public class Q1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> dice = new ArrayList();
        long N = sc.nextLong();

        for (int i = 0; i < 6; i++) {
            dice.add(sc.nextInt());
        }
        Collections.sort(dice);

        int one = dice.get(0);
        int two = dice.get(0) + dice.get(1);
        int three = dice.get(0) + dice.get(1) + dice.get(2);
        int special1 = dice.get(0) + dice.get(1) + dice.get(2) + dice.get(3) + dice.get(4) + dice.get(5);
        int special2 = 4 * (two + three);
        if (N == 1) {
            System.out.println(special1);
        }
        else if (N == 2) {
            System.out.println(special2);
        } else {
            long oneNum = ((N - 1) * (N - 2) * 4 + (N - 2) * (N - 2));
            long twoNum = (N - 1) * 4 + (N - 2) * 4;
            long threeNum = 4;
            System.out.println(one * oneNum + two * twoNum + three * threeNum);
        }
    }

}
