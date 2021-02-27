package com.github.illiaderhun.jclessons;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // add elements
        var names = new ArrayList<String>();
        names.add("Tim");
        names.add("Lucy");
        names.add("Pat");
        System.out.println(names);

        names.add("Angela");
        System.out.println(names);

        names.add(2, "Steve");
        System.out.println(names);

        // change elements
        names.set(0, "Peter");
        System.out.println(names);

        // remove
        names.remove("Peter");
        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        // iterate over list
        for (String studentName : names) {
            System.out.println(studentName);
        }

        // size
        System.out.println("The array list size: " + names.size());

        // sort
        Collections.sort(names);
        System.out.println(names);

        // check
        if (names.contains("abc")) {
            System.out.println("Yes, he is here");
        } else {
            System.out.println("He is absent");
        }

        // clear
        names.clear();
        System.out.println(names);
    }
}
