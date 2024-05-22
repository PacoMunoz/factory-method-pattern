package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    private static Delivery delivery;

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if (value == 1) {
            delivery = new DeliveryByRoad();
            delivery.deliver();
        } else {
            delivery = new DeliveryBySea();
            delivery.deliver();
        }

    }
}
