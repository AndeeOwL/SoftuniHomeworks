package com.company;

import java.util.Scanner;

public class PrintCompanyInformation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Company name:");
        String companyName = input.nextLine();

        System.out.println("Company address:");
        String companyAddress = input.nextLine();

        System.out.println("Phone number:");
        String phoneNumber = input.nextLine();

        System.out.println("Fax number:");
        String faxNumber = input.nextLine();

        System.out.println("Web site:");
        String webSite = input.nextLine();

        System.out.println("Manager first name:");
        String managerFirstName = input.nextLine();

        System.out.println("Manager last name:");
        String managerLastName = input.nextLine();

        System.out.println("Manager age:");
        String managerAge = input.nextLine();

        System.out.println("Manager phone:");
        String managerPhone = input.nextLine();

        System.out.println(companyName);
        System.out.println("Address: " + companyAddress);
        System.out.println("Tel. " + phoneNumber);
        if (faxNumber.equals("")) {
        System.out.println("Fax: (no fax)");
        }
        else {
            System.out.println("Fax: " + faxNumber);
        }
        System.out.println("Web site: " + webSite);
        System.out.println("Manager: " + managerFirstName + " " + managerLastName +
                " (age: " + managerAge + ", tel. " + managerPhone +")");

    }
}
