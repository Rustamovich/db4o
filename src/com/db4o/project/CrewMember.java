package com.db4o.project;

public class CrewMember {
    private String name;
    private String adress;
    private String job;

    public CrewMember(String name, String adress, String job){
        this.name = name;
        this.adress = adress;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getJob() {
        return job;
    }
}
