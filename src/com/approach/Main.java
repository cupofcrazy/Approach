package com.approach;


public class Main {

    public static void main(String[] args) {

        Bank capitalOne = new Bank("Capital One");
        capitalOne.addNewBranch("Florida");
        capitalOne.addNewBranch("Colorado");

        capitalOne.addCustomerToBranch("Florida", "Brooks", 100.45);
        capitalOne.addCustomerToBranch("Colorado", "Daniel", 230.78);
        capitalOne.addCustomerToBranch("Florida", "Jeremiah", 44.61);


        capitalOne.addCustomerTransaction("Florida", "Brooks", 800.34);
        capitalOne.addCustomerTransaction("Florida", "Brooks", 111.52);
        capitalOne.listAllCustomers("Colorado", true);












    }
    private static int[] reverse(int[] array) {
        int start = array[0];
        int end = array[array.length - 1];
        int temp;

        // Repeat this process
        while (start < end) {
            temp = array[start]; // Save the first element to memory
            array[start] = array[end]; // Set the position of the first item to the last
            array[end] = temp; // Then set the last element to the position of the first element saved to memory
            start++; // Increment the value by one
            end--; // Decrement the value by one
        }
        return array;
    }
}
