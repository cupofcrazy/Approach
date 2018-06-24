package com.approach;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    /**
     *
     * @param name: Name of branch
     */
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }
    public boolean addCustomer(String name, double initialAmount) {
        if (findCustomer(name) == null) {
            this.customers.add(new Customer(name, initialAmount));
            return true;
        }
        return false;
    }
    private Customer findCustomer(String name) {
        for (Customer customer : this.customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
    public boolean addCustomerTransaction(String name, double amount) {
        if (findCustomer(name) != null) {
            Customer existingCustomer = findCustomer(name);
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }
    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }
}
