package com.company;

import java.awt.*;

public class Main {

    public static  void main(String[] args) {

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

        havy_car track = new havy_car(350, "horton","Kontur", "have", 250f);
        havy_car.hello = "havy_track info";
        System.out.println(havy_car.hello);
        System.out.println(track.marka);

        moto type_m = new moto();

        moto.hello = "info about moto";
        type_m.height = "up to 200";
        type_m.weight1 = "up to 200";
        type_m.weight2 = "up to 400";

        System.out.println(moto.hello);
        System.out.println(type_m.height = "height up to 200sm");
        System.out.println(type_m.weight1 = "weight up to 200kg");
        System.out.println(type_m.weight2 = "weight up to 400kg");
        sport.KPP("KPP - mechanic");
        sport.KPP("KPP - tiptronik(avtomat)");
        type_m.type_of_motor("type_of_motor - V8");
        type_m.type_of_motor("type_of_motor - V6");





    }



}
