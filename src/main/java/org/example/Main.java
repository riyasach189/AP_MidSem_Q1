package org.example;

public class Main {
    public static void main(String[] args) {
        Rotatable rotator = new Rotator();
        Rotatable flyer = new Flyer();
        Rotatable helicopter = new Helicopter();

        Helicopter driver = new Helicopter();

        driver.drive(rotator);
        driver.drive(flyer);
        driver.drive(helicopter);
    }
}