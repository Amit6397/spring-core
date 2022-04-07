package com.sunglowsys.autowiringUsingXml;

public class Emp {
    private Address address;

    public Emp(){

    }

    public Emp(Address address) {
        System.out.println("setting values");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("satting  value");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
