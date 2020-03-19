package com.company.aqa.module4.catdogmotherfucker.animals;

public abstract class Animal {

    private int numberOfLegs;
    private boolean tailExist;
    private int numberOfHeads;
    private String color;

    public Animal(){
    }

    public void voice(){
        System.out.println("What I can say?");
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isTailExist() {
        return tailExist;
    }

    public void setTailExist(boolean tailExist) {
        this.tailExist = tailExist;
    }

    public int getNumberOfHeads() {
        return numberOfHeads;
    }

    public void setNumberOfHeads(int numberOfHeads) {
        this.numberOfHeads = numberOfHeads;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
