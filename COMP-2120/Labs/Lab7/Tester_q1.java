
class Tester_q1 {
    public static void main(String[] args) {
        Invoice in = new Invoice();
        in.show();
        System.out.println("Payemnt is " + in.getPaymentAmount());

        System.out.println(" ");
        Employee e = new Employee();
        e.show();
        System.out.println("Payemnt is " + e.getPaymentAmount());
    }
}
