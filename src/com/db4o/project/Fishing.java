package com.db4o.project;

import java.sql.Time;
import java.util.Date;

public class Fishing {
    private String vesselName;
    private CrewMember crewMember1;
    private CrewMember crewMember2;
    private CrewMember crewMember3;
    private CrewMember crewMember4;
    private CrewMember crewMember5;
    private String dateOut;
    private String dateIn;
    private String sort1;
    private String weightSort1;
    private String sort2;
    private String weightSort2;
    private String sort3;
    private String weightSort3;
    private String sort4;
    private String weightSort4;
    private String sort5;
    private String weightSort5;

    public Fishing(String vesselName, CrewMember crewMember1, CrewMember crewMember2, CrewMember crewMember3,
    CrewMember crewMember4, CrewMember crewMember5, String dateOut, String dateIn,
    String sort1, String weightSort1, String sort2, String weightSort2, String sort3, String weightSort3,
    String sort4, String weightSort4, String sort5, String weightSort5){
          this.vesselName = vesselName;
          this.crewMember1 = crewMember1;
        this.crewMember2 = crewMember2;
        this.crewMember3 = crewMember3;
        this.crewMember4 = crewMember4;
        this.crewMember5 = crewMember5;
        this.dateOut = dateOut;
        this.dateIn = dateIn;
        this.sort1 = sort1;
        this.weightSort1 = weightSort1;
        this.sort1 = sort2;
        this.weightSort2 = weightSort2;
        this.sort3 = sort3;
        this.weightSort3 = weightSort3;
        this.sort4 = sort4;
        this.weightSort4 = weightSort4;
        this.sort5 = sort5;
        this.weightSort5 = weightSort5;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public CrewMember getCrewMember1() {
        return crewMember1;
    }

    public void setCrewMember1(CrewMember crewMember1) {
        this.crewMember1 = crewMember1;
    }

    public CrewMember getCrewMember2() {
        return crewMember2;
    }

    public void setCrewMember2(CrewMember crewMember2) {
        this.crewMember2 = crewMember2;
    }

    public CrewMember getCrewMember3() {
        return crewMember3;
    }

    public void setCrewMember3(CrewMember crewMember3) {
        this.crewMember3 = crewMember3;
    }

    public CrewMember getCrewMember4() {
        return crewMember4;
    }

    public void setCrewMember4(CrewMember crewMember4) {
        this.crewMember4 = crewMember4;
    }

    public CrewMember getCrewMember5() {
        return crewMember5;
    }

    public void setCrewMember5(CrewMember crewMember5) {
        this.crewMember5 = crewMember5;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getSort1() {
        return sort1;
    }

    public void setSort1(String sort1) {
        this.sort1 = sort1;
    }

    public String getWeightSort1() {
        return weightSort1;
    }

    public void setWeightSort1(String weightSort1) {
        this.weightSort1 = weightSort1;
    }

    public String getSort2() {
        return sort2;
    }

    public void setSort2(String sort2) {
        this.sort2 = sort2;
    }

    public String getWeightSort2() {
        return weightSort2;
    }

    public void setWeightSort2(String weightSort2) {
        this.weightSort2 = weightSort2;
    }

    public String getSort3() {
        return sort3;
    }

    public void setSort3(String sort3) {
        this.sort3 = sort3;
    }

    public String getWeightSort3() {
        return weightSort3;
    }

    public void setWeightSort3(String weightSort3) {
        this.weightSort3 = weightSort3;
    }

    public String getSort4() {
        return sort4;
    }

    public void setSort4(String sort4) {
        this.sort4 = sort4;
    }

    public String getWeightSort4() {
        return weightSort4;
    }

    public void setWeightSort4(String weightSort4) {
        this.weightSort4 = weightSort4;
    }

    public String getSort5() {
        return sort5;
    }

    public void setSort5(String sort5) {
        this.sort5 = sort5;
    }

    public String getWeightSort5() {
        return weightSort5;
    }

    public void setWeightSort5(String weightSort5) {
        this.weightSort5 = weightSort5;
    }
}
