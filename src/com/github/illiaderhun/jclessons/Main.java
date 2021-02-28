package com.github.illiaderhun.jclessons;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // add elements
        var names = new LinkedList<String>();
        names.add("Tim");
        names.add("Lucy");
        names.add("Pat");
        System.out.println(names);

        names.add("Angels");
        System.out.println(names);

        names.add(2, "Steve");
        System.out.println(names);

        names.set(0, "Peter");
        System.out.println(names);

        names.remove("Peter");
        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        names.removeFirst();
        names.removeLast();

        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Size of the list: " + names.size());

        Collections.sort(names);
        System.out.println(names.contains("Pat"));

        // additional methods
        names.push("Steve");
        System.out.println(names);

        System.out.println(names.pop());
        System.out.println(names);

        names.poll();
        names.pollFirst();

        names.pollLast();

        names.add("A");
        System.out.println(names.peek());

        System.out.println(names.peekFirst());
        System.out.println(names.peekLast());

        names.clear();
        System.out.println(names);
    }
}