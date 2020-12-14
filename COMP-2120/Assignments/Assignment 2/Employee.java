package com.company.Assignment2;

public class Employee extends Person{
    private int hiringYear,vacationDays,unusedVacationDays;
    private double annualSalary;

    public Employee(String firstName, String lastName) {
        hiringYear = 0;
        annualSalary = 0;
        vacationDays = 0;
        unusedVacationDays = 0;
    }

    public Employee(String firstName, String lastName, int hiringYear, double annualSalary, int vacationDays, int unusedVacationDays) {
        this.hiringYear = hiringYear;
        this.annualSalary = annualSalary;
        this.vacationDays = vacationDays;
        this.unusedVacationDays = unusedVacationDays;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    public int getHiringYear()
    {
        return hiringYear;
    }

    public void setHiringYear(int hiringYear)
    {
        this.hiringYear = hiringYear;
    }

    public int getVacationDays()
    {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays)
    {
        this.vacationDays = vacationDays;
    }

    public void setUnusedVacationDays(int unusedVacationDays)
    {
        this.unusedVacationDays = unusedVacationDays;
    }

    public int getUnusedVacationDays()
    {
        return unusedVacationDays;
    }

    @Override
    public String toString()
    {
        return super.toString()+" Hiring Year: "+hiringYear+", Annual Salary: $"+getAnnualSalary()+", Vacation Days: "+getVacationDays()+", Vacation days left: "+getUnusedVacationDays();
    }
}
