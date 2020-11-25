package ru.mirea.lab10.ex2;

import java.util.StringTokenizer;

public class Address {
    private StringBuffer country;
    private StringBuffer region;
    private StringBuffer city;
    private StringBuffer street;
    private StringBuffer house;
    private StringBuffer building;
    private StringBuffer apartment;

    public Address() {
    }

    public void format_split(String address) {
        String[] arrOfStr = address.split(",");
        country = new StringBuffer(arrOfStr[0]);
        region = new StringBuffer(arrOfStr[1]);
        city = new StringBuffer(arrOfStr[2]);
        street = new StringBuffer(arrOfStr[3]);
        house = new StringBuffer(arrOfStr[4]);
        building = new StringBuffer(arrOfStr[5]);
        apartment = new StringBuffer(arrOfStr[6]);
    }

    public void StringToken(String address) {
        StringTokenizer arrOfStr = new StringTokenizer(address, "-");
        country = new StringBuffer(arrOfStr.nextToken());
        region = new StringBuffer(arrOfStr.nextToken());
        city = new StringBuffer(arrOfStr.nextToken());
        street = new StringBuffer(arrOfStr.nextToken());
        house = new StringBuffer(arrOfStr.nextToken());
        building = new StringBuffer(arrOfStr.nextToken());
        apartment = new StringBuffer(arrOfStr.nextToken());
    }

    public StringBuffer getApartment() {
        return apartment;
    }

    public StringBuffer getBuilding() {
        return building;
    }

    public StringBuffer getCity() {
        return city;
    }

    public StringBuffer getCountry() {
        return country;
    }

    public StringBuffer getHouse() {
        return house;
    }

    public StringBuffer getRegion() {
        return region;
    }

    public StringBuffer getStreet() {
        return street;
    }
}
