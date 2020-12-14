
class Employee implements Payable {
    int empCode = 123;
    String empName = "Tammy";
    double hourlyRate = 52;
    int workingHours = 8;
    double payment;

    public double getPaymentAmount() {
        int taxAmt = 13;
        payment = workingHours * hourlyRate;
        return payment;
    }

    public void show() {
        System.out.println("Employee code:" + empCode);
        System.out.println("Employee Name:" + empName);
        System.out.println("Working Hour:" + workingHours);
    }

}
