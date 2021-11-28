package com.grit;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    // State
    private String name;
    private Long personNumber;
    private List<Account> accountList;

    // Behavior
    // Constructor
    public Customer(String name, Long personNumber) {
        this.name = name;
        this.personNumber = personNumber;
        accountList = new ArrayList<>();
    }

    public Customer(String name, Long personNumber, List<Account> accountList) {
        this.name = name;
        this.personNumber = personNumber;
        this.accountList = accountList;
    }

    // Getters
    public Long getPersonNumber() {
        return personNumber;
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setName(String name) {
        this.name = name;
    }

}
