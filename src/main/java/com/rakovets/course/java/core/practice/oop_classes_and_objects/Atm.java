package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100){
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public int getNumberBanknotes20() {
        return this.numberBanknotes20;
    }

    public int getNumberBanknotes50() {
        return this.numberBanknotes50;
    }

    public int getNumberBanknotes100() {
        return this.numberBanknotes100;
    }

    public void addBanknotes20(int number) {
        this.numberBanknotes20 -= number;
    }

    public void addBanknotes50(int number) {
        this.numberBanknotes50 -= number;
    }

    public void addBanknotes100(int number) {
        this.numberBanknotes100 -= number;
    }
}