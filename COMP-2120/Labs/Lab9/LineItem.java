
import java.util.*;
import java.io.*;


public class LineItem {

    private int quantity;
    private Product prod;
    private boolean outOfStock;


    public LineItem(int quant, Product pro) {
        prod = pro;
        quantity = quant;

        if (pro.getAvailability() >= quant && quant > 0) {
            outOfStock = false;
        } else {
            outOfStock = true;
        }

    }

    public double getTotalPrice() {
        return prod.getPrice() * quantity;
    }


    public boolean outOfStock() {
        return outOfStock;
    }


    public String format() {
        return String.format("\n\n%-20s%8.2f%6d%12.2f\n", prod.getName(), prod.getPrice(), quantity, getTotalPrice());
    }

}
