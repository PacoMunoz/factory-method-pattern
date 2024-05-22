package org.example;

public class DeliveryByRoad extends Delivery {

    @Override
    public Transport createTransport() {
        return new Trunk();
    }
}
