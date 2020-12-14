package com.company.Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FriendsList {
    private ArrayList<Person> friends;

    /**
     * Constructor
     */
    public FriendsList() {
        friends = new ArrayList<>();
    }

    /**
     * Adds friend
     * @param person
     */
    public void addFriend(Person person) {
        friends.add(person);
    }

    /**
     * Delete friend
     * @param person
     */
    public void deleteFriend(Person person){
        System.out.println("Removing "+person.getFirstName());
        friends.remove(person);
    }

    /**
     * Sorts all of the friends by last name
     * @return  sorted friends
     */
    public ArrayList<Person> sortByLastName() {

        Collections.sort(friends, new Comparator<Person>()
        {
            @Override
            public int compare(Person person, Person t1)
            {
                return person.getLastName().compareTo(t1.getLastName());
            }
        });

        return friends;
    }

    /**
     * Gives the total number of friends
     * @return friends.size()
     */
    public int totalFriends() {
        return friends.size();
    }

    public ArrayList<Person> friendsBornInMonth(int month) {
        ArrayList<Person> bornSameMonth = new ArrayList<>();
        for (Person person : friends)
        {
            if (person.getBirthMonth() == month)
            {
                bornSameMonth.add(person);
            }
        }

        Collections.sort(bornSameMonth, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1)
            {
                return person.getBirthDay() - t1.getBirthDay();
            }
        });
        return bornSameMonth;

    }

    /**
     * Returns friends born on the day
     * @param day
     * @return bornDay
     */
    public ArrayList<Person> friendsBornOnDay(int day) {
        ArrayList<Person> bornOnDay = new ArrayList<>();
        for (Person person : friends) {
            if (person.getBirthDay() == day)
            {
                bornOnDay.add(person);
            }
        }

        Collections.sort(bornOnDay, new Comparator<Person>()
        {
            @Override
            public int compare(Person person, Person t1)
            {
                return person.getLastName().compareTo(t1.getLastName());
            }
        });
        return bornOnDay;

    }

    /**
     * gives cellNo from first name and last name
     * @param firstName
     * @param lastName
     * @return cellNo
     */
    public String getCellNo(String firstName, String lastName)
    {
        for (Person person : friends)
        {
            if (person.getFirstName().equalsIgnoreCase(firstName) && person.getLastName().equalsIgnoreCase(lastName)) {
                return person.getCellNo();
            }
        }

        return "Not Found";
    }

    /**
     * Deletes by first name
     * @param firstName
     */
    public void deleteByFirstName(String firstName) {
        for (Person person : friends)
        {
            if (person.getFirstName().equalsIgnoreCase(firstName))
            {
                friends.remove(person);
            }
        }
    }

    /**
     * Deletes friend with info provided
     * @param firstName
     * @param lastName
     * @param month
     * @param day
     */
    public void deleteFriend(String firstName, String lastName, int month, int day)
    {
        Person person = null;
        for (Person a : friends)
        {
            if (a.getFirstName().equalsIgnoreCase(firstName) && a.getLastName().equalsIgnoreCase(lastName) &&a.getBirthMonth() == month && a.getBirthDay() == day)
            {
                person = a;
                break;
            }
        }
        if (person != null)
            friends.remove(person);

    }

    /**
     * Deletes friend from cellNumber
     * @param cellNo
     */
    public void deleteFriend(String cellNo)
    {
        Person person = null;
        for (Person a : friends) {
            if (a.getCellNo().equals(cellNo))
            {
                person = a;
                break;
            }
        }
        if (person != null)
            friends.remove(person);

    }

}
