package com.grit;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    // State
    private String name;
    private Long personNumber;



    // Behavior

    // Constructor
    public Customer(String name, Long personNumber) {
        this.name = name;
        this.personNumber = personNumber;
    }



    // Getters

    public Long getPersonNumber() {
        return personNumber;
    }

    public String getName() {
        return name;
    }

    // Methods
    /*public String changeCustomerName(String name, Long personNumber){
        return null;
    }

    public String getCustomerInfo(Long personNumber){
        return null;
    }*/
    /*public int addAccount(Long personNumber){
        return 0;
    }
    public String GetAccount(long personNumber, int accountNumber){
        return null;
    }

    public String CloseAccount(long personNumber, int accountNumber){
        return null;
    }*/

}
