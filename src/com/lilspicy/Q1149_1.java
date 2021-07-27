package com.lilspicy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class House {
    int r;
    int g;
    int b;
    ArrayList<Integer> rgb = new ArrayList();
    public House(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;

        rgb.add(this.r);
        rgb.add(this.g);
        rgb.add(this.b);
    }

    public int findMinExceptColor(House prevhouse, int a) {
        int index = prevhouse.rgb.indexOf(a);
        ArrayList<Integer> clone = (ArrayList<Integer>) rgb.clone();
        clone.remove(index);
        return Collections.min(clone);
    }

}

public class Q1149_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        House[] houses = new House[N];

        for (int i = 0; i < N; i++) {
            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();
            houses[i] = new House(r, g, b);
        }


        ArrayList mins = new ArrayList();

        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> route = new ArrayList(N);
            int num=0;
            route.add(0,houses[0].rgb.get(i));

            for (int j = 1; j < N; j++) {
                int index = j - 1;
                int zzz = houses[j].findMinExceptColor(houses[index], route.get(index));
                route.add(j, zzz);
            }
            for (int k = 0; k < route.size(); k++) {
                num += route.get(k);

            }
            mins.add(num);

        }
        System.out.println(Collections.min(mins));
    }
}
