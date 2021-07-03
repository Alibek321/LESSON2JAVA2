package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Samsung").print();
        createObject("Iphone").print();
        createObject("Xiaomi").print();
    }

    private static Printtabl createObject(String name) {
        Printtabl temp = null;
        switch(name) {
            case "Samsung":
                temp = new Samsung("Samsung", 3000);
                break;

            case "Iphone":
                temp = new Iphone("Iphone", 2000);
                break;

            case "Xiaomi":
                temp = new MI("MI", 200);
                break;

            default:
                return temp;
        }
        return temp;
    }


}
