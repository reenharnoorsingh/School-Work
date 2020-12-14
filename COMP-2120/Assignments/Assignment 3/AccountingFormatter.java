package com.company.Assignment3;

public class AccountingFormatter implements NumberFormatter {
    @Override
    public String format(int n) {
        String data;
        if (n < 0) {
            data = String.format("(%d)", Math.abs(n));
        } else {
            data = String.format("%d", n);
        }
        return data;
    }
}
