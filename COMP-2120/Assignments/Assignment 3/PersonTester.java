package com.company.Assignment3;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] list = new Person[10];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter the name of the person " + (i + 1) + ": ");
            list[i] = new Person(sc.nextLine());
        }
        Person first = list[0], last = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(first) < 0)
                first = list[i];
            if (list[i].compareTo(last) > 0)
                last = list[i];
        }
        System.out.println("First Person  " + first.getName());
        System.out.println("Last Person " + last.getName());
    }
}
