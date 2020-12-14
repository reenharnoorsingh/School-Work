package com.company.Assignment2;

import java.util.ArrayList;

public class Company {
    //instance variables
    private String companyName;
    private int startingYear;
    private ArrayList<Manager> managers;
    private ArrayList<Manager> employees;

    /**
     * Default Constructor
     */
    public Company()
    {
        companyName = "";
        startingYear = 1900;
        managers = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public Company(String companyName, int startingYear)
    {
        this.companyName = companyName;
        this.startingYear = startingYear;
        managers = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public void addManager(Manager manager)
    {
        managers.add(manager);
    }

    @Override
    public String toString()
    {
        return "Company: " + companyName + " Established on: " + startingYear + "\n" +"Total managers in the company: " + managers.size();
    }
}
