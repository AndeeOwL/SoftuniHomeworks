package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split("\\s+");
        Map<Integer,BankAccount> accounts = new LinkedHashMap<>();
        while (!command[0].equals("End")){
        switch (command[0]) {

            case "Create":
                BankAccount acc = new BankAccount();
                System.out.println("Account ID"+acc.getId() + " created");
                accounts.put(acc.getId(), acc);
                break;

            case "Deposit":
                int idToDeposit = Integer.parseInt(command[1]);
                int moneyToDeposit = Integer.parseInt(command[2]);
                if (accounts.containsKey(idToDeposit)) {
                    accounts.get(idToDeposit).deposit(moneyToDeposit);
                    System.out.println("Deposited "+ moneyToDeposit +" to ID" + idToDeposit);
                } else {
                    System.out.println("Account does not exist");
                }
                break;

            case "SetInterest":
                double globalInterest = Double.parseDouble(command[1]);
                BankAccount.setInterestRate(globalInterest);
                break;

            case "GetInterest":
                int idToGet = Integer.parseInt(command[1]);
                int yearsToAdd = Integer.parseInt(command[2]);
                if (accounts.containsKey(idToGet)) {
                    double interest = accounts.get(idToGet).getInterest(yearsToAdd);
                    System.out.printf("%.2f%n",interest);

                } else {
                    System.out.println("Account does not exist");
                }
                break;


        }
            command = scanner.nextLine().split("\\s+");
        }
	    //  Create
        // Deposit {Id} {Amount}
        // SetInterest {Interest}
        // GetInterest {ID} {Years}
        // End
    }
}
