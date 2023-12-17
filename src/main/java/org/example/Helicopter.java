package org.example;

public class Helicopter implements RotateAndFly{

    public Helicopter() {
    }

    @Override
    public void rotate() {

    }

    @Override
    public void fly() {

    }

    public void drive(Rotatable r)
    {
        System.out.println(r.getClass());
    }

}
