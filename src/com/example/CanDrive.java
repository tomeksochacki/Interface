package com.example;

public interface CanDrive extends CanFly, CanSwimm {

    public void start();
    public void stop();
    public void turnLeft();
    public void turnRight();
    public void accelerate();
    public void goConstantSpeed();
    public int speedMax();


}
