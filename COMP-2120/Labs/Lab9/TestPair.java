
import java.util.ArrayList;
import java.util.Collections;

public class TestPair {
    public static void main(String[] args) {

        //testing the pairs class methods with simple pair objects
        Pair<String,String> onePair = new Pair<String,String>();
        Pair<String,String> anotherPair = new Pair<String,String>();
        onePair.setFirst("I am first");
        onePair.setSecond("I am second");
        anotherPair.setFirst("Hello!");
        anotherPair.setSecond("Hi!");

        System.out.println(onePair);
        System.out.println(anotherPair);
        System.out.println("Both Pairs are equal: "+onePair.equals(anotherPair)+"\n\n");

        //  create a ArrayList of Pair objects with one element string and another element as arrayList of string
        ArrayList<Pair<String, ArrayList<String>>> my_pairs = new ArrayList<Pair<String,ArrayList<String>>>();

        String beautiful = "beautiful";
        ArrayList<String> beautiful_synonyms = new ArrayList<String>();
        beautiful_synonyms.add("attractive");
        beautiful_synonyms.add("pretty");
        beautiful_synonyms.add("lovely");
        Collections.sort(beautiful_synonyms);
        //create pair object for these words
        Pair<String,ArrayList<String>> p1 = new Pair<String,ArrayList<String>>();
        p1.setFirst(beautiful);
        p1.setSecond(beautiful_synonyms);

        String happy = "happy";
        ArrayList<String> happy_synonyms = new ArrayList<String>();
        happy_synonyms.add("joyful");
        happy_synonyms.add("upbeat");
        happy_synonyms.add("content");
        Collections.sort(happy_synonyms);
        //create pair object for these words
        Pair<String,ArrayList<String>> p2 = new Pair<String,ArrayList<String>>();
        p2.setFirst(happy);
        p2.setSecond(happy_synonyms);

        String funny = "funny";
        ArrayList<String> funny_synonyms = new ArrayList<String>();
        funny_synonyms.add("humorous");
        funny_synonyms.add("comical");
        Collections.sort(funny_synonyms);
        //create pair object for these words
        Pair<String,ArrayList<String>> p3 = new Pair<String,ArrayList<String>>();
        p3.setFirst(funny);
        p3.setSecond(funny_synonyms);

        my_pairs.add(p1);
        my_pairs.add(p2);
        my_pairs.add(p3);

        System.out.println("Arraylist of Pairs:\n" + my_pairs);

        my_pairs.sort((o1, o2) -> o1.getFirst().compareTo(o2.getFirst()));

        System.out.println("\nSorted Arraylist of Pairs:\n" + my_pairs);

    }
}
