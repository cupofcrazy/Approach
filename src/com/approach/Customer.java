package com.approach;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double initialAmount;
    private ArrayList<Double> transactions;

    /**
     *
     * @param name: Name of customer
     * @param initialAmount: Initial amount / transaction of customer to add to the bank
     */
    public Customer(String name, double initialAmount) {
        this.name = name;
        this.initialAmount = initialAmount;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }
    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
