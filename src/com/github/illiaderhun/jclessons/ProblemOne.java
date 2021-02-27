package com.github.illiaderhun.jclessons;

import java.util.ArrayList;

public class ProblemOne {
    public static void main(String[] args) {
        var one = new ArrayList<String>();
        var two = new ArrayList<String>();

        one.add("One");
        one.add("Two");
        one.add("Three");

        two.add("Four");
        two.add("Five");
        two.add("Six");

        // the third array list has to be like: One, Two, Three, Four, Five, Six

        var oneJoinTwo = new ArrayList<String>();
        oneJoinTwo.addAll(one);
        oneJoinTwo.addAll(two);
        System.out.println(oneJoinTwo);

    }
}
