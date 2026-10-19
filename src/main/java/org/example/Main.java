package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CuentaBancaria cuenta = new CuentaBancaria(0);

        Thread[] hilos = new Thread[5];

        for (int i = 0; i < hilos.length; i++){
            hilos[i] = new Thread(new Depositante(cuenta));
        }

        for (int i = 0; i < hilos.length; i++){
            hilos[i].start();
        }

        for (int i = 0; i < hilos.length; i++){
            hilos[i].join();
        }

        System.out.println("Esperado: " + 5000);
        System.out.println("Real: " + cuenta.getSaldo());

    }
}