
class Invoice implements Payable {

    String product_name = "Hair oil";
    int quantity = 2;
    double price = 200;
    int tax_in_per = 20;
    double payment;

    public double getPaymentAmount() {
        payment = (price * quantity) + (tax_in_per);
        return payment;
    }

    public void show() {
        System.out.println("Product name:" + product_name);
        System.out.println("Price:" + price);
        System.out.println("Quantity:" + quantity);
        System.out.println("Tax:" + tax_in_per + "%");
    }

}
