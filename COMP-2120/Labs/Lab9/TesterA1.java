

import java.util.*;
import java.io.*;


public class TesterA1 {

    public static void main(String[] args) {
        Address a1 = new Address("232 Jatt Street");
        Invoice i1 = new Invoice(a1);
        Product p1 = new Product("Shampoo", 10.99, 20);
        Product p2 = new Product("Conditioner", 8.90, 1);
        Product p3 = new Product("Soap", 2.80, 4);
        Product p4 = new Product("scrub", 2.00, 20);
        i1.add(3, p1);
        i1.add(1, p2);
        i1.add(4, p3);
        i1.add(0, p4);
        System.out.println(i1.format());
    }

}
