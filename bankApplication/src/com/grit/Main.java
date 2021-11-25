package com.grit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int Options;
    public static int getOptions;
    public static Long personNumber;

    public static void main(String[] args) {
	// write your code here
       Bank bank = new Bank();
        List<Customer> customerList = new ArrayList<>();
        List<Account> accountList = new ArrayList<>();

        String bankName = bank.setBankName("Malmö`s bank");
        Scanner scanner = new Scanner(System.in);



            System.out.println("Welcome to " + bankName + " ,What do you want to du? ");
            while (getOptions == 0 && Options !=10) {
                System.out.println("Choose one of the following options by entering the line number!");
                System.out.println("1. Add a new customer  ");
                System.out.println("2. Change customer name ");
                System.out.println("3. Remove a customer from the bank system ");
                System.out.println("4. Create an account to a customer ");
                System.out.println("5. Close an account ");
                System.out.println("6. See information a bout a specific customer ");
                System.out.println("7. Deposit ");
                System.out.println("8. Withdraw ");
                System.out.println("9. Print a list of bank`s customers to a textfile ");
                System.out.println("10. Leave");
                getOptions += 1;

                System.out.println("The customers list size is "+customerList.size());


                Options = scanner.nextInt();

                String name, firstName, lastName;



                switch (Options) {
                    case 1:
                        System.out.println("Add a new customer  ");
                        System.out.println("First name? ");
                        firstName = scanner.next();
                        System.out.println("Last name? ");
                        lastName = scanner.next();
                        name = firstName + " " + lastName;
                        System.out.println("PersonNumber? ");
                        personNumber = scanner.nextLong();
                        System.out.println(name + " " + personNumber);
                        customerList.add(new Customer(name, personNumber));
                        getOptions = 0;

                        break;
                    case 2:
                        System.out.println("Change customer name ");
                        System.out.println("Please enter the customer personNumber ");
                        personNumber = scanner.nextLong();
                        for (int i = 0; i < customerList.size(); i++) {

                            if (personNumber.equals(customerList.get(i).getPersonNumber()) ) {
                                System.out.println("The customer is in the system list");
                            } else{
                                System.out.println("No such a customer exist! make sure to write the right pesronNumber");}
                            getOptions = 0;
                        }
                        break;
                    case 3:
                        System.out.println("Remove a customer from the bank system ");

                        getOptions = 0;
                        break;
                    case 4:
                        System.out.println("Create an account to a customer ");

                        getOptions = 0;
                        break;
                    case 5:
                        System.out.println("Close an account ");

                        getOptions = 0;
                        break;
                    case 6:
                        System.out.println("See information a bout a specific customer ");

                        getOptions = 0;
                        break;
                    case 7:
                        System.out.println("Deposit ");

                        getOptions = 0;
                        break;
                    case 8:
                        System.out.println("Withdraw ");

                        getOptions = 0;
                        break;
                    case 9:
                        System.out.println("Print a list of bank`s customers to a textfile ");

                        getOptions = 0;
                        break;
                    case 10:
                        System.out.println("Leave");

                        getOptions = 0;
                        break;

                }

            }






    }
}
