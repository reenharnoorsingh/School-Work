package com.company.Assignment3;

public class DefaultFormatter implements NumberFormatter{
    @Override
    public String format(int n) {
        return String.valueOf(n);
    }
}
