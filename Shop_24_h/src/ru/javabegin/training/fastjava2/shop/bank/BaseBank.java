package ru.javabegin.training.fastjava2.shop.bank;

import ru.javabegin.training.fastjava2.shop.interfeces.Bank;

public class BaseBank implements Bank {

    private String name;
    private String creditDescription;

    @Override
    public void checkInfo() {


    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }

    @Override
    public void giveCredit() {


    }

    @Override
    public String getName() {
        return name;
    }
}
