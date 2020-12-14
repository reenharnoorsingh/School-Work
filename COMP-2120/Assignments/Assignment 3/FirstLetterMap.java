package com.company.Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FirstLetterMap {

    public static void main(String args[]) throws FileNotFoundException {
        File file1= new File("test2.txt");
        Scanner in= new Scanner(file1);
        Map<Character, HashSet<String>> map= new TreeMap<Character, HashSet<String>>();

        for(int i=97; i<=122; i++) {
            map.put((char) i, new HashSet<String>());
        }

        int i=0;
        while(in.hasNext()) {
            String word= in.next().toLowerCase();
            in.useDelimiter("[^a-zA-Z]+");
            char first= word.charAt(0);
            HashSet<String> words= map.get(first);
            words.add(word);
            map.put(first, words);
        }

        for(Character letter : map.keySet()) {
            if(!map.get(letter).isEmpty())
                System.out.println(letter+ ": " +map.get(letter));
        }
    }
}
