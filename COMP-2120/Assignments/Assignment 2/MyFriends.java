package com.company.Assignment2;

import java.util.ArrayList;

public class MyFriends {
    public static void main(String[] args) {
        FriendsList myFriends = new FriendsList();

        Person p1 = new Person("Sidhu","Moosewala","119-92-1234",04,25);
        Person p2 = new Person("Jake","Peralta","887-57-5578",05,20);
        Person p3 = new Person("Peter","Parker","666-66-6666",03,26);

        myFriends.addFriend(p1);
        myFriends.addFriend(p2);
        myFriends.addFriend(p3);
        System.out.println("All my friends");
        ArrayList<Person> friends = myFriends.sortByLastName();
        for(Person person:friends)
        {
            System.out.println(person);
        }
        System.out.println("\nFriends Born in May");
        ArrayList<Person> mayBorn = myFriends.friendsBornInMonth(05);
        for(Person person:mayBorn)
        {
            System.out.println(person);
        }

        System.out.println("Friends Born on 26th?");
        ArrayList<Person> born26th = myFriends.friendsBornOnDay(26);
        for(Person person:born26th)
        {
            System.out.println(person);
        }

        System.out.println("Current Number of Friends "+myFriends.totalFriends());
        System.out.println("Jake's phone number #: "+myFriends.getCellNo("Jake","Peralta"));
        myFriends.deleteFriend(p1);
        System.out.println("Updated no. of Friends "+myFriends.totalFriends());
    }
}
