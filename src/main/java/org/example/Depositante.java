package org.example;

public class Depositante implements Runnable{
    private final CuentaBancaria cuenta;

    public Depositante(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run(){
        for(int i = 0; i<1000; i++){
            cuenta.depositar(1);
        }
    }
}
