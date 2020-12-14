
import java.util.*;
import java.io.*;


public class Product {
    private String name;
    private double price;
    private int availability;


    public Product(String name, double price, int a) {
        this.name = name;
        this.price = price;
        this.availability = a;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailability() {
        return availability;
    }
}
