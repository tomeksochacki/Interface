package com.example;

public class Car implements CanDrive, CanSwimm, CanFly {

    @Override
    public int speedMax() {
        return 120;
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerate");
    }

    @Override
    public void goConstantSpeed() {
        System.out.println("Car go constant");
    }

    @Override
    public void start() {
        System.out.println("Car start");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }

    @Override
    public void turnLeft() {
        System.out.println("Car turn left");
    }

    @Override
    public void turnRight() {
        System.out.println("Car turn right");
    }
}
