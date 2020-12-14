package com.company.Assignment3;

import java.util.LinkedList;

public class ListUtil {

    public static void reverse(LinkedList<String> strings) {
        String temp;
        for (int i = 0; i < strings.size() / 2; i++) {
            temp = strings.get(i);
            strings.set(i, strings.get(strings.size() - i - 1));
            strings.set(strings.size() - i - 1, temp);
        }
    }
}