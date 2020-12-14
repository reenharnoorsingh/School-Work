package com.company.Assignment1;

import java.util.Scanner;

public class Problem1 {
    //Write a Java program, in which declare and initialize required variables with some arbitrary values, and
    //compute the following mathematical operations
    //s = so * vo - 1/2g * t^3
    //&
    //G = 3/4pi^2 * a^3/(p^(1/2)*(m1-m2))
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //first equation
        System.out.println("Equation 1: Enter the values");
        double s0, v0, t;//initializing variables
        double g = 9.8;//setting g as 9.8
        System.out.println("Enter the value of s0");
        s0 = sc.nextDouble();
        System.out.println("Enter the value for v0");
        v0 = sc.nextDouble();
        System.out.println("Enter the value of t");
        t  = sc.nextDouble();
        double s = (s0*v0) - (0.5*g*Math.pow(t,3));//using the pow() function instead of t*t*t
        System.out.println("s = "+ s);

        //second equation
        System.out.println("Equation 2: Enter the values");
        double pi = 3.14;// setting pi as 3.14
        double a,p,m1,m2; // initializing variables
        System.out.println("Enter the of a");
        a = sc.nextDouble();
        System.out.println("Enter the value of p");
        p = sc.nextDouble();
        System.out.println("Enter the value of m1");
        m1 = sc.nextDouble();
        System.out.println("Enter the value of m2");
        m2 = sc.nextDouble();
        double G = ((3/4)*Math.pow(pi,2))*((Math.pow(a,3))/(Math.pow(p,0.5)*(m1-m2)));
        System.out.println("G = "+G);
    }
}
