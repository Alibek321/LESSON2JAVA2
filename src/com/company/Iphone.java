package com.company;

public class Iphone extends TELEFON implements Printtabl{
    private int price;


    public Iphone(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Цена за Iphone: " + price  );

    }
}
