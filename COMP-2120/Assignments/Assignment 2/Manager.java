package com.company.Assignment2;

import java.util.ArrayList;

public class Manager extends Employee {
    private double monthlyBonus;
    private ArrayList<Employee> employees;

    public Manager(String firstName, String lastName)
    {
        super(firstName, lastName);
        employees = new ArrayList<>();
    }

    public Manager(String firstName, String lastName, int hiringYear, double annualSalary, int vacationDays, int unusedVacationDays)
    {
        super(firstName, lastName, hiringYear, annualSalary, vacationDays, unusedVacationDays);
        monthlyBonus = 0;
        employees = new ArrayList<>();
    }

    public double getMonthlyBonus()
    {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus)
    {
        this.monthlyBonus = monthlyBonus;
    }

    public ArrayList<Employee> getEmployees()
    {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees)
    {
        this.employees = employees;
    }

    public void displayEmployees()
    {
        for (Employee employee : employees)
        {
            System.out.println(employee);
        }
    }

    public int getEmployeesCount()
    {
        return employees.size();
    }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Monthly Bonus: " + getMonthlyBonus() +" $";
    }
}
