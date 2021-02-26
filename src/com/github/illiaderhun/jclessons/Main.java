package com.github.illiaderhun.jclessons;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        // currentLength + (currentLength >>> 1)
        // currentLength + (currentLength / 2)
        // 10 + (10 / 2) = 15
        // 15 + (15 / 2) = 22

        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\n ==== ");
        System.out.println(list);
    }
}
