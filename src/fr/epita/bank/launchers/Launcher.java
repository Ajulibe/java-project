package fr.epita.bank.launchers;

import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.InvestmentAccount;
import fr.epita.bank.datamodel.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

    public static void main(String[] args) {
        System.out.println("Welcome to this application");
        Customer customer = new Customer("Paris", "Thomas");

        //creating a new array to store investment account info
        List<InvestmentAccount> investmentAccountList = new ArrayList<>();
        investmentAccountList.add( new InvestmentAccount(10));


        //creating a new list to save savings account details
        List<SavingsAccount> savingsAccountList = new ArrayList<>();
        savingsAccountList.add( new SavingsAccount(10));


        customer.setInvestmentAccounts(investmentAccountList);
        customer.setSavingsAccounts(savingsAccountList);

        System.out.println(customer);


    }
}