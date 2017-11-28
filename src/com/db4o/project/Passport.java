package com.db4o.project;

public class Passport {
    private String name;
    private String type;
    private String displacement;
    private String year;

    public Passport(String name, String type, String dispalacement, String year){
        this.name = name;
        this.type = type;
        this.displacement = displacement;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getYear() {
        return year;
    }
}
