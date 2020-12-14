package com.company.Assignment3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUtil {

    public static <E> void reverseInPlace(ArrayList<E> list) {
        E temp;
        for (int i = 0; i < list.size() / 2; i++) {
            temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
    }

    public static <E> ArrayList<E> reverse(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<E>();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(list.size() - i - 1));
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(6, 2, 9, 1));
        System.out.println("Original list: " + numbers);
        reverseInPlace(numbers);
        System.out.println("Reversed list: " + numbers);

        numbers = new ArrayList<>(Arrays.asList(3, 9, 1, 6, 4));
        System.out.println("\nOriginal list: " + numbers);
        reverseInPlace(numbers);
        System.out.println("Reversed list: " + numbers);
    }
}