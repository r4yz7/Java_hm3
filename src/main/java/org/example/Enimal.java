package org.example;

public class Enimal {
    String name;
    double speed;

    public Enimal(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nSpeed: " + this.speed + "\n";
    }
}
