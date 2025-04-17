package com.example.javamarathon;

public class callingAMethod {
    public static void main(String[] args){
        double s = sum(9,8);

        System.out.println(s);

        Practice p = new Practice();
        p.PrintValue();
        System.out.println(p.y);




    }
    public static double sum(int a, int b){
        return a+b;
    }
}
