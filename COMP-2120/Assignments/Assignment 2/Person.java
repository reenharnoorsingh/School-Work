package com.company.Assignment2;

public class Person {
    //instance variables
    private String firstName;
    private String lastName;
    private String cellNo;
    private int birthMonth;
    private int birthDay;

    //constructors

    /**
     * Default Constructor
     */
    public Person() {
        cellNo = "";
        birthMonth = 0;
        firstName = "";
        lastName = "";
        birthDay = 0;
    }

    /**
     * Overload Constructor
     * @param firstName
     * @param lastName
     * @param cellNo
     * @param birthMonth
     * @param birthDay
     */
    public Person(String firstName, String lastName, String cellNo, int birthMonth, int birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellNo = cellNo;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    /**
     * Gets you the first name
     * @return  firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets you the last name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets you the cell number
     * @return cellNo
     */
    public String getCellNo() {
        return cellNo;
    }

    /**
     * Sets cell number
     * @param cellNo
     */
    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    /**
     * Gets you the birth month
     * @return birthMonth
     */
    public int getBirthMonth() {
        return birthMonth;
    }

    /**
     * Sets birth month
     * @param birthMonth
     */
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    /**
     * Gets you the birth day
     * @return birthDay
     */
    public int getBirthDay() {
        return birthDay;
    }

    /**
     * Sets birth day
     * @param birthDay
     */
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Name- " + firstName + " " + lastName + ", Birthday- " + getBirthMonth() + "/" + getBirthDay() + ", Cell number- " +getCellNo();
    }
}
