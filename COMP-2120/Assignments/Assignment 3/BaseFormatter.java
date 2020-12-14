package com.company.Assignment3;

public class BaseFormatter implements NumberFormatter{
    private int base;
    public BaseFormatter(int base){
        this.base=base;
    }

    @Override
    public String format(int n) {
        return Integer.toString(n,base);
    }
}
