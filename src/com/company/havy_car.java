package com.company;

public class havy_car extends type_car {
    int max_speed;
    protected int max_height;
    protected float max_weight;


    public havy_car(int height, String model, String marka, String type, float weight) {
        super(height, model, marka, type, weight);
        this.max_height = height;
        this.max_speed = max_speed;
        this.max_weight = max_weight;
    }
}
