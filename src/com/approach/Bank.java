package com.approach;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    /**
     *
     * @param name
     */
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }
    // Add a new branch if branch name does not already exists
    public boolean addNewBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {

            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    // Add a new customer to a current branch
    public boolean addCustomerToBranch(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomer(customerName, initialAmount);
        }
        return false;
    }
    // Find a branch and return it
    private Branch findBranch(String name) {
        for (Branch branch : this.branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean listAllCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Here is a list of all customer details in branch '" + branch.getName() + "'");
            for (int i = 0; i < branch.getCustomers().size(); i++) {
                Customer customer = branch.getCustomers().get(i);
                System.out.println("Customer [" + i + "] - " + customer.getName());
                if (showTransactions) {
                    System.out.println("Transactions for: " + customer.getName());
                    ArrayList<Double> customerTransactions = customer.getTransactions();
                    for (int j = 0; j < customerTransactions.size() ; j++) {
                        System.out.println("[" + (j+1) + "] - $" + customerTransactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
