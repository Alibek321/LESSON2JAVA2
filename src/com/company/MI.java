package com.company;

public class MI extends TELEFON implements Printtabl{
    private int thecost;


    public MI(String name,int thecost ) {
        super(name);
        this.thecost=thecost;

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Цена за MI: " + thecost);
    }


}
