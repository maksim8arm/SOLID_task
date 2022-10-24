package com.company;


public class SenderToMail implements Isender {
    @Override
    public void send(String mail) {
        System.out.println("Письмо c заказом отправлено на почту " + mail);
    }
}
