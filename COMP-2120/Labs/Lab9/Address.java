
import java.util.*;
import java.io.*;


public class Address {
    private String address;

    public Address(String address) {
        this.address = address;
    }

    public String format() {
        return "Address: " + address + "\n";
    }

}
