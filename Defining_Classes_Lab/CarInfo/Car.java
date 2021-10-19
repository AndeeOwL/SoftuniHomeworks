package com.company;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }


    public void carInfo() {
        System.out.println("The car is: " + this.brand + " " + this.model + " - " + this.horsePower + " HP.");
    }

    public Car(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }
    public Car(String brand,String model,int horsePower){
        this(brand);
        this.model = model;
        this.horsePower = horsePower;
    }
}
