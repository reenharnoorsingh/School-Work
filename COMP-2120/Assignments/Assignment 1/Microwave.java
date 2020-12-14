package com.company.Assignment1;

import java.util.Scanner;

public class Microwave {
    String power_level = "";//initializing power as empty
    int time_sec =0;//initializing time as 0

    public void start(){ //starts microwave
        System.out.print("Cooking For..............");
        System.out.print(time_sec + " seconds at ");
        System.out.print(power_level+" level\n");
    }
    public void stop(){
        System.out.println("Cooking Stopped");
        power_level="";
        time_sec=0;
    }
    public void changePowerLevel(){
        System.out.println("Power levels:\n1. Low\n2. Medium\n3. High\nPlease select the power level you want");
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();
        switch (level){
            case 1:
                power_level ="LOW";
                break;
            case 2:
                power_level="MEDIUM";
                break;
            case 3:
                power_level="HIGH";
                break;
            default:
                System.out.println("Select a valid option number");
        }
        System.out.println("Current Power level: "+power_level);
    }
    public void reset(){
        System.out.println("Resetting microwave.......");
        power_level = "null";//
        time_sec = 0;
        System.out.println("Current Power Level: "+power_level);
        System.out.println("Remaining Time in secs:"+time_sec);
    }
    public void increaseTime30(){
        System.out.println("Increasing time by 30secs.......");
        time_sec = time_sec + 30;
        System.out.println("Remaining Time in secs: "+time_sec);
    }
}
