package com.company.Assignment2;

import java.util.Scanner;

public class PrimePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upper limit: ");
        int limit = sc.nextInt();
        PrimeGenerator primeGenerator = new PrimeGenerator();
        while(true)
        {
            int nextPrime = primeGenerator.nextPrime();
            if(nextPrime > limit)
                break;
            System.out.println(nextPrime);
        }
    }
}
