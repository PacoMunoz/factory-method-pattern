package org.example;

public abstract class Delivery {

    public void deliver() {
        System.out.println("Buscando medio de transporte");
        System.out.println("Medio de transporte encontrado");
        Transport transport = createTransport();
        transport.transport();
        System.out.println("Fin del transporte");
    }

    public abstract Transport createTransport();
}
