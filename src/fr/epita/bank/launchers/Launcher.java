package fr.epita.bank.launchers;

import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.SavingsAccount;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Welcome to this application");
        Customer customer = new Customer("Paris", "Thomas");

        System.out.println(customer);
    }
}