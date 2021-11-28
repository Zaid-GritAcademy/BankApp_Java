package com.grit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int Options,getOptions,amount;
    public static Long personNumber;
    public static String name, firstName, lastName, newName;

    public static void main(String[] args) {
	// write your code here
       Bank bank = new Bank();

        String bankName = bank.setBankName("Malmö`s bank");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to " + bankName + "!, What do you want to du? ");
        while (getOptions == 0 && Options !=9) {
                System.out.println("Choose one of the following options by entering the line number!");
                System.out.println("1. Add a new customer  ");
                System.out.println("2. Change customer name ");
                System.out.println("3. Remove a customer from the bank system ");
                System.out.println("4. Create an account to a customer ");
                System.out.println("5. Close an account ");
                System.out.println("6. See information a bout a specific customer ");
                System.out.println("7. Deposit ");
                System.out.println("8. Withdraw ");
                System.out.println("9. Leave");
                getOptions += 1;

            System.out.println("Customers are: "+bank.GetCustomers());


                Options = scanner.nextInt();

                switch (Options) {
                    case 1:
                        System.out.println("Add a new customer  ");
                        System.out.println("First name?");
                        firstName = scanner.next();
                        System.out.println("Last name?");
                        lastName = scanner.next();
                        name = firstName+" "+lastName;
                        System.out.println("PersonNumber?");
                        personNumber = scanner.nextLong();
                        System.out.println(name +" "+personNumber);
                        bank.addCustomer(name,personNumber);
                        getOptions = 0;
                        break;
                    case 2:
                        System.out.println("Change customer name ");
                        System.out.println("Please enter the customer personNumber ");
                        personNumber = scanner.nextLong();
                        for (int i = 0; i < bank.getCustomerList().size(); i++) {
                            if (personNumber.equals(bank.getCustomerList().get(i).getPersonNumber())) {
                                System.out.println("The customer is " + bank.getCustomerList().get(i).getName());
                                System.out.println("New name? ");
                                newName = scanner.next();
                                System.out.println("Customer name changed to " + bank.changeCustomerName(newName, personNumber));
                            } else if (! personNumber.equals(bank.getCustomerList().get(i).getPersonNumber())){
                                System.out.println("No such a customer exist! make sure to write the right pesronNumber");
                            }
                        }

                            getOptions = 0;

                        break;
                    case 3:
                        System.out.println("Remove a customer from the bank system ");
                        System.out.println("Please enter the customer personNumber");
                        personNumber = scanner.nextLong();
                        for (int i = 0; i < bank.getCustomerList().size(); i++) {
                            if (personNumber.equals(bank.getCustomerList().get(i).getPersonNumber()) ) {
                                System.out.println("The customer is "+bank.getCustomerList().get(i).getName());
                                bank.RemoveCustomer(personNumber);
                                System.out.println("customer removed from the system ");

                            } else{
                                System.out.println("No such a customer exist! make sure to write the right pesronNumber");
                            }

                        }
                        getOptions = 0;
                        break;
                    case 4:
                        System.out.println("Create an account to a customer ");
                        System.out.println("Please enter the customer personNumber ");
                        personNumber = scanner.nextLong();
                        for (int i = 0; i < bank.getCustomerList().size(); i++) {
                            if (personNumber.equals(bank.getCustomerList().get(i).getPersonNumber())) {
                                System.out.println("The customer is " + bank.getCustomerList().get(i).getName());
                                bank.addAccount(personNumber);
                                System.out.println("Account added successfully!");

                            } else {
                                System.out.println("No such a customer exist! make sure to write the right pesronNumber");
                            }
                        }
                            getOptions = 0;

                        break;
                    case 5:
                        System.out.println("Close an account ");
                        System.out.println("Please enter the customer personNumber ");
                        personNumber = scanner.nextLong();
                        for (int i = 0; i < bank.getCustomerList().size(); i++) {
                            if (personNumber.equals(bank.getCustomerList().get(i).getPersonNumber())) {
                                System.out.println("The customer is " + bank.getCustomerList().get(i).getName());
                                bank.closeAccount(personNumber);
                                System.out.println("Account closed successfully!");

                            } else {
                                System.out.println("No such a customer exist! make sure to write the right pesronNumber");
                            }
                        }
                        getOptions = 0;
                        break;
                    case 6:
                        System.out.println("See information a bout a specific customer ");
                        System.out.println("Please enter the customer personNumber ");
                        personNumber = scanner.nextLong();
                        for (int i = 0; i < bank.getCustomerList().size(); i++) {
                            if (personNumber.equals(bank.getCustomerList().get(i).getPersonNumber())) {
                                System.out.println("The customer is " + bank.getCustomerInfo(personNumber));

                            } else {
                                System.out.println("No such a customer exist! make sure to write the right pesronNumber");
                            }
                        }
                            getOptions = 0;

                        break;
                    case 7:
                        System.out.println("Deposit ");
                        System.out.println("Please enter the customer personNumber ");
                        personNumber = scanner.nextLong();
                        for (int i = 0; i < bank.getCustomerList().size(); i++) {
                            if (personNumber.equals(bank.getCustomerList().get(i).getPersonNumber())) {
                                System.out.println("The customer is "+bank.getCustomerInfo(personNumber));
                                System.out.println("How much money du you want to add to your account?");
                                amount = scanner.nextInt();
                                bank.getCustomerList().get(i).getAccountList().get(i).Deposit(personNumber,amount);
                                System.out.println("The customer saldo updated "+bank.getCustomerInfo(personNumber));
                            } else {
                                System.out.println("No such a customer exist! make sure to write the right pesronNumber");
                            }

                        }
                        getOptions = 0;
                        break;
                    case 8:
                        System.out.println("Withdraw ");
                        System.out.println("Please enter the customer personNumber ");
                        personNumber = scanner.nextLong();
                        for (int i = 0; i < bank.getCustomerList().size(); i++) {
                            if (personNumber.equals(bank.getCustomerList().get(i).getPersonNumber())) {
                                System.out.println("The customer is "+bank.getCustomerInfo(personNumber));
                                System.out.println("How much? ");
                                amount = scanner.nextInt();
                                bank.getCustomerList().get(i).getAccountList().get(i).withdraw(personNumber,amount);
                                System.out.println("The customer saldo updated "+bank.getCustomerInfo(personNumber));
                            } else {
                                System.out.println("No such a customer exist! make sure to write the right pesronNumber");
                            }

                        }
                        getOptions = 0;
                        break;

                    case 9:
                        System.out.println("Close the program");
                        System.exit(9);
                        getOptions = 0;
                        break;

                }

            }






    }
}
