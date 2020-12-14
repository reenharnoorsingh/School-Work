package com.company.Assignment2;

public class MyCompany {
    public static void main(String[] args) {
        Company c1 = new Company("Dunder Mifflin Paper Co.", 1911);
        Manager m1 = new Manager("Michael", "Scott", 2020, 9000000, 26, 10);

        m1.setMonthlyBonus(500550);
        c1.addManager(m1);
        c1.toString();
        Employee e1 = new Employee("Jim", "Halpert", 2000, 50500, 7, 3);
        Employee e2 = new Employee("Pam", "Beesly", 2009, 50060, 2, 10);
        Employee e3 = new Employee("Dwight", "Shrute", 2015, 70500, 3, 16);
        Employee e4 = new Employee("Kevin", "Malone", 2018, 60060, 3,9);
        Employee e5 = new Employee("Stanley", "Hudson", 2019, 55000, 4, 8);

        m1.addEmployee(e1);
        m1.addEmployee(e2);
        m1.addEmployee(e3);
        m1.addEmployee(e4);
        m1.addEmployee(e5);

        System.out.println(c1);
        System.out.println("Total employees working under Michael "+ m1.getEmployeesCount());
    }
}
