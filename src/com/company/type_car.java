package com.company;

public class type_car extends car {

    String type;
   protected int height ;
  protected   float weight;
    public type_car(int height, String model,String marka,String type ,float weight ){
        super(marka,model);
        this.type = type;
        this.height = height;
        this.weight = weight;
    }




}
