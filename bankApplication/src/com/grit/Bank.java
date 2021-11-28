package com.grit;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    // State
    private String bankName;
    private List<Customer> customerList;


    // Behavior
    // Constructor

    public Bank() {
        customerList = new ArrayList<>();
        this.bankName = bankName;
    }

    public Bank(List<Customer> customerList) {
        this.customerList = customerList;
    }
    // Getters

    public String getBankName() {
        return bankName;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    // Setter
    public String setBankName(String bankName) {
        this.bankName = bankName;
        return bankName;
    }

    // Methods
    public List<String> GetCustomers(){
        List<String> customers = new ArrayList<>();
        for (var customer:customerList) {
            customers.add(new String(String.valueOf(customer.getName())));

        }
        return customers;
    }

    public void addAccount(Long pNr){
        for (int i = 0; i < customerList.size(); i++) {
            if (pNr.equals(customerList.get(i).getPersonNumber())){
                customerList.get(i).getAccountList().add(new Account(0,"DebitAcccount",1001));

            }

        }

    }

    public void closeAccount(Long pNr){
        for (int i = 0; i < customerList.size(); i++){
            if (pNr.equals(customerList.get(i).getPersonNumber())){
                customerList.get(i).getAccountList().remove(i);
            }
        }
    }

    public String getCustomerInfo(Long pNr) {
        String info = new String();
        for (int i = 0; i < customerList.size(); i++) {
            if (pNr.equals(customerList.get(i).getPersonNumber()) && ! customerList.get(i).getAccountList().isEmpty() ) {
                info = customerList.get(i).getName() + ", Account type: " + customerList.get(i).getAccountList().get(i).getAccountType() + ", Account number: " + customerList.get(i).getAccountList().get(i).getAccountNumber() + ", saldo: " + customerList.get(i).getAccountList().get(i).getSaldo() + "kr";
            } else if (customerList.get(i).getAccountList().isEmpty()) {
                info = customerList.get(i).getName() + ", this customer has no account! ";
            }
        }
        return info;
    }

    public  void  addCustomer(String name, Long pNr){
        customerList.add(new Customer(name,pNr));

    }

    public void RemoveCustomer(long pNr){
        for (int i = 0; i < customerList.size(); i++){
           if (pNr == (customerList.get(i).getPersonNumber())){
               getCustomerList().remove(i);

           }
        }

    }

    public String changeCustomerName(String newName, Long pNr){
        for (int i = 0; i < customerList.size(); i++) {
            if (pNr.equals(customerList.get(i).getPersonNumber()))
                customerList.get(i).setName(newName);
        }
            return newName;

    }

}