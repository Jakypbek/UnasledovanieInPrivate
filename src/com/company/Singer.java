package com.company;

public class Singer extends Person {

    private String bandName;

    public Singer() {
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println(getName() + " is singing in the " + bandName + " band and becoming better at his " + getDesignation());
    }

    public void playGitar() {
        System.out.println(getName() + " is playing gitar in the " + bandName + " band");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                "} " + super.toString();
    }
}
