package com.company.Assignment2;

public class PrimeGenerator {
    private int current;

    public PrimeGenerator() {
        current = 1;
    }
    /**
     Calculates the next prime number.
     @return the next prime number
     */
    public int nextPrime()
    {
        int nextPrime;
        while(true)
        {
            if(isPrime(current))
            {
                nextPrime = current;
                current++;
                break;
            }
            current++;
        }
        return nextPrime;
    }
    /**
     Check if n is a prime number.
     @param n to check whether it is prime or not
     @return true if n is prime
     */
    public static boolean isPrime(int n)
    {
        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int a = 5; a * a <= n; a = a + 6)
            if (n % a == 0 || n % (a + 2) == 0)
                return false;

        return true;
    }
}
