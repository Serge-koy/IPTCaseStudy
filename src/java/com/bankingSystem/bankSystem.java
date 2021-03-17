/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankingSystem;

/**
 *
 * @author jm
 */

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class bankSystem {
    
    private int money;
    private int balance;
    
    /*
    setter method lagay nyo dito
    list
    1. withdraw
    2. deposit
    3. transfer money
    4. loan
    5. month of payment
    */
    @WebMethod
    public void setWithdraw(int money){
         this.money = money;
    }
    
    
    /*
    dito nyo naman lagay mga function methods
    list ko na
    1. withdraw
    2. deposit
    3. check balance dito sa part na to display lang ung balance
    4. transfer money
    5. loan ammount
    6. duration of payment (months)
    */
    public int withdraw(){
        if(money < balance)
            System.out.println("not enough balance"); 
         else {
             balance -= money;
        }
         return balance;    
    }
}
