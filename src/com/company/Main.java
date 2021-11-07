package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        car sport = new car("R8","audi");
        car.hello = "info car: -c";
        System.out.println(car.hello);
        sport.yers = 2015;
        System.out.println("Sport car is: ");
        System.out.println(sport.marka = "audi");
        System.out.println(sport.model = "R8");
        sport.KPP("This type car have a Tiptronik KPP!");
        System.out.println(sport.yers = 2015);

        car havy = new car();

        havy.marka = "MAZ";
        havy.model = "Kontinent";
        havy.yers = 2010;
        System.out.println("Havy car is: ");
        System.out.println(sport.marka = "MAZ");
        System.out.println(sport.model = "Kontinent");
        sport.KPP("This type car have a mechanics KPP!");
        System.out.println(sport.yers = 2010);
        type_car sportcar = new type_car(195,"A4","Audi","cabriolet",2.5f);
        System.out.println(sportcar.type);
    }
}
