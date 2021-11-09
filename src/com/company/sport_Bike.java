package com.company;

public class sport_Bike extends moto {
    int max_speed;
    char color;
    int max_oboroti;
    String marka;
    String model;

    public sport_Bike(int height,int max_speed,int max_oboroti, String marka, String model,String weight1, String weight2) {
        super(weight1,height,weight2);
        this.max_speed = max_speed;
        this.color = color;
        this.max_oboroti = max_oboroti;
        this.marka = marka;
        this.model = model;

    }

}
