package com.company;


public class Buyer {

    private String name;
    Isender buyerSendMail;

    public Buyer(String name, Isender buyerSendMail) {
        this.name = name;
        this.buyerSendMail = buyerSendMail;
    }

}
