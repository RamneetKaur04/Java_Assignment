package com.example.assignment_3_java;

public class CurrencyConverter {
    private static final double EXCHANGE_RATE = 74.5; // Exchange rate from dollars to rupees

    public double convertDollarsToRupees(double dollars) {
        return dollars * EXCHANGE_RATE;
    }
}
