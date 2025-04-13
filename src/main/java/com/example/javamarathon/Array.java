package com.example.javamarathon;
import java.util.*;
public class Array {
    public static void main (String[] args){
        String[] cars = {"Toyota", "Tesla"};
        System.out.println(Arrays.toString(cars));

        for (String var : cars){
            System.out.println(var);

        }
        //Array list
        ArrayList<String> cars2 = new ArrayList<>();
        cars2.add("Tesla");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Mazda");
        cars2.add("Toyota");
        System.out.println(cars2);
        System.out.println(cars2.get(0));
        System.out.println(cars2.get(1));


    }
}
