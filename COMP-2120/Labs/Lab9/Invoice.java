
import java.util.*;
import java.io.*;


public class Invoice {

    private Address address;
    private ArrayList<LineItem> lineItem;

    public Invoice(Address add) {
        address = add;
        lineItem = new ArrayList<LineItem>();
    }

    public void add(int quantity, Product prod) {
        LineItem item = new LineItem(quantity, prod);

        if (!item.outOfStock()) {
            lineItem.add(item);
        }

    }

    public double getAmountDue() {
        double amountDue = 0;
        for (LineItem item : lineItem) {
            amountDue += item.getTotalPrice();
        }
        return amountDue;
    }

    public String format() {
        String s = "INVOICE \n\n" + address.format() + String.format("\n%-20s%8s%5s %8s\n", "Product", "Price", " Quantity", "Total");
        for (LineItem item : lineItem) {
            s = s + item.format();

        }
        s = s + String.format("\nAmount Due: %34.2f", getAmountDue());
        return s;
    }


}
