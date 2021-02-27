package com.github.illiaderhun.jclessons;

import java.util.ArrayList;

public class ProblemTwo {
    public static void main(String[] args) {
        var one = new ArrayList<String>();
        var two = new ArrayList<String>();

        one.add("One");
        one.add("Three");
        one.add("Five");

        two.add("Two");
        two.add("Four");
        two.add("Six");

        // the third array list has to be like: One, Two, Three, Four, Five, Six

        var zip = new ArrayList<String>();

        for (int i = 0; i < one.size(); i++) {
            zip.add(one.get(i));
            zip.add(two.get(i));
        }

        System.out.println(zip);
    }
}
