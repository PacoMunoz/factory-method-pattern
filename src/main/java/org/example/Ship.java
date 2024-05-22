package org.example;

public class Ship implements Transport{

    @Override
    public void transport() {
        System.out.println("Delivering product by Ship");
    }
}
