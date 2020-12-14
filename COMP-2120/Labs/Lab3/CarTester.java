package com.company.Lab3;

public class CarTester {
    public static void main(String[] args) {
        //Part 1
        Car car = new Car("Suzuki","Breeza",2020,19500);
        System.out.println("Car Model: "+car.getModel());
        System.out.println("Car Make: "+car.getMake());
        System.out.println("Year: "+car.getYear());
        System.out.println("Price: $"+car.getPrice());

        car.turnOn();
        for (int i=0;i<20;i++){
            car.accelerate();
        }
        System.out.println("Current Speed after Accelerating :"+ car.getSpeed());
        for (int i = 0; i<15; i++){
            car.decelerate();
        }
        System.out.println("Current Speed after Decelerating: "+car.getSpeed());
        System.out.println("Is car moving? "+car.isMoving());
        car.stop();
        System.out.println("Current Speed after stop: "+car.getSpeed());
        car.turnOff();

        //Gas Efficiency Part
        Car car2 = new Car(20);
        car2.addGas(20);
        car2.drive(100);
        System.out.println("Gas in Tank: "+ car2.getGasInTank());
        System.out.println("Miles to go with the amount of gas left: "+car2.getMilesToGo());
    }
}
