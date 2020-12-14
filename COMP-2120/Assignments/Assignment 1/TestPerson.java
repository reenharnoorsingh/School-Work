package com.company.Assignment1;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Harnoor",19);
        System.out.println("Name of Person: "+ p1.getName());
        System.out.println("Age of Person: "+p1.getAge());
        p1.setWalkDistCapability(6);
        System.out.println("Walking Capability of Person: "+ p1.getWalkDistCapability());
        p1.setTired(false);
        p1.walk(4);
        System.out.println("Total distance walked: "+p1.getDistanceWalking());
        p1.setAwake(true);
        p1.sleep();
        p1.awake();
        p1.setHungry(false);
        p1.Eat();
        p1.talk();
        for (int i = 0; i < 37; i++) {
            p1.grow();
        }
        System.out.println("Walking Capability of Person: "+ p1.getWalkDistCapability());
        p1.needFood();
        p1.Eat();
        System.out.println(p1.isAwake());
        System.out.println(p1.isHungry());
        p1.walk(4);
        Person p2 = new Person();
        p2.setName("Vaishnavi");
        p2.setAge(19);
        p2.setTired(true);
        p1.changeFriend(p2);
        p1.getFriend();
    }
}
