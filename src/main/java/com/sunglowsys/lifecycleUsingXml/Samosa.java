package com.sunglowsys.lifecycleUsingXml;

public class Samosa {
    private double price;

    public Samosa() {
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
    //using init and destroy methord
    public void init() {
        System.out.println("Inside init methord ");
    }

    public void destroy() {
        System.out.println("Inside destroy methord");
    }
}
