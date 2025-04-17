package com.example.javamarathon;

import static com.example.javamarathon.Practice.PrintValue;

public class callingAMethod {
    public static void main(String[] args){
        double s = sum(9,8);

        System.out.println(s);

//        Practice p = new Practice();
//        p.PrintValue();
//        System.out.println(p.y);
        PrintValue();




    }
    public static double sum(int a, int b){
        return a+b;
    }
}
