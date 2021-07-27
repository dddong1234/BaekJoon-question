//package com.lilspicy;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//class House2 {
//
//    ArrayList<Integer> rgb = new ArrayList();
//    public House2(int r, int g, int b) {
//        rgb.add(r);
//        rgb.add(g);
//        rgb.add(b);
//    }
//
//    public int findMinExceptColor(House2 prevhouse,House2 nexthouse, int a, int b) {
//        int index = prevhouse.rgb.indexOf(a);
//        int index2 = nexthouse.rgb.indexOf(b);
//        ArrayList<Integer> clone = (ArrayList<Integer>) rgb.clone();
//        ArrayList<Integer> clone2 = (ArrayList<Integer>) rgb.clone();
//        clone.remove(index);
//        clone2.remove(index2);
//        clone.retainAll(clone2);
//        return clone.get(0);
//    }
//
//}
//public class Q1149 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        House2[] houses = new House2[N];
//
//        for (int i = 0; i < N; i++) {
//            int r = sc.nextInt();
//            int g = sc.nextInt();
//            int b = sc.nextInt();
//            houses[i] = new House2(r, g, b);
//        }
//        ArrayList mins = new ArrayList();
//
//        for (int i = 0; i < 3; i++) {
//            ArrayList<Integer> route = new ArrayList(N);
//            int num=0;
//            route.add(0,houses[0].rgb.get(i));
//
//            for (int j = 1; j < N; j++) {
//                int index = j - 1;
//                int zzz = houses[j].findMinExceptColor(houses[index], houses[index+2],houses[index].rgb.get()));
//                route.add(j, zzz);
//            }
//            for (int k = 0; k < route.size(); k++) {
//                num += route.get(k);
//
//            }
//            mins.add(num);
//
//        }
//        System.out.println(Collections.min(mins));
//    }
//}
