package org.example;

public class DeliveryBySea extends Delivery{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
