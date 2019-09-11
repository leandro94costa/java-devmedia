package Lectures.lecture7.part8.adapters;

import ConcreteFactory.AccountingSystem.AccountingSystem;

public class AccountingAdapterIBM extends AccountingAdapter {

    public AccountingAdapterIBM() {
        accountingSystem = new AccountingSystem("IBM");
    }
}