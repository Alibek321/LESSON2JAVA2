package com.company;

public class Samsung extends TELEFON implements Printtabl{
    private int rate;

    public Samsung(String name,int rate) {
        super(name);
        this.rate=rate;
    }

    @Override
    public void print() {
        super.print();
        System.out.println( "Цена за Samsung: " +rate);
    }

}
