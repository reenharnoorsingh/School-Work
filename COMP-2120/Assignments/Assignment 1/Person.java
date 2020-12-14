package com.company.Assignment1;

public class Person {
    //instance variables
    private String name;
    private int age;
    private double distanceWalking;
    private double walkDistCapability;
    private boolean awake;
    private boolean tired;
    private boolean hungry;
    Person friend;

    //default constructor
    public Person(){
        this.name = "";
        this.age=0;
        this.distanceWalking=0;
        this.walkDistCapability=4;//default for all
        this.awake=false;
        this.tired=false;
        this.hungry=false;
    }
    //constructor with 2 parameters
    public Person(String name, int age){
        this();
        this.name=name;
        this.age=age;
    }
    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDistanceWalking(double distanceWalking) {
        this.distanceWalking = distanceWalking;
    }

    public void setAwake(boolean awake) {
        this.awake = awake;
    }

    public void setTired(boolean tired) {
        this.tired = tired;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void setWalkDistCapability(double walkDistCapability) {
        this.walkDistCapability = walkDistCapability;
    }
    //getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getDistanceWalking() {
        return distanceWalking;
    }

    public double getWalkDistCapability() {
        return walkDistCapability;
    }

    public boolean isTired() {
        return tired;
    }

    public boolean isHungry() {
        return hungry;
    }

    public boolean isAwake() {
        return awake;
    }

    //methods
    public void talk(){
        if(age>=2){
            System.out.println("Person can talk");
        }else {
            System.out.println("Person cannot talk");
        }
    }
    public void Eat(){
        if(hungry){
            System.out.println("Person is hungry and now eating food");
        }else {
            System.out.println("Not Hungry");
        }
        hungry=false;//person now is not hungry
    }
    public void needFood(){
        hungry = true;
        System.out.println("Person is now hungry give food");
    }
    public double walk(double distanceToBeWalked){
        this.distanceWalking = distanceWalking+distanceToBeWalked;
        if(distanceWalking>walkDistCapability){ //if person walks more than their capability they are tired
            tired=true;
            System.out.println("Person can't walk more than capacity");
        }else {
            System.out.println("Walking now");
        }return distanceWalking;
    }
    public void sleep(){
        if(awake){
            awake=false;
            System.out.println("Sleeping now");
        }else {
            System.out.println("Already sleeping");
        }
    }
    public void awake(){
        if (awake == false){
            awake = true;
            System.out.println("Person is now up from sleep");
        }else {
            System.out.println("Already awake");
        }
    }
    public void grow(){
        age = age+1;
        System.out.println("Age of person is now "+age);
        if (age>=55){
            if (age%5==0){
                walkDistCapability = walkDistCapability/2;
                System.out.println("The ability of Walking now is "+ walkDistCapability);
            }
        }
    }
    public void changeFriend(Person friend){
        this.friend=friend;
    }

    public Person getFriend() {
        if (friend == null) {
            System.out.println("No friend");
        } else {
            System.out.println("Name of friend: " + friend.getName());
        }
        return friend;
    }
}
