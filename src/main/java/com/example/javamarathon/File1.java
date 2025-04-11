package com.example.javamarathon;

import java.util.Scanner;

public class file1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int x = 10;
        System.out.println("The jersey number of Lionel Messi is " +x);
        char y = 'M';
        System.out.println("His name is "+y+"essi");
        String z = "Lionel Messi";
        System.out.println("His name is " +z);
        double a = 10;
        System.out.println(a/2.0);

        //User input
        Scanner inp = new Scanner(System.in);

        String name = inp.nextLine();
        System.out.println("Hello " + name);




    }
}