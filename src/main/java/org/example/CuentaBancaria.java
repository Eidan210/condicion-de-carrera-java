package org.example;

public class CuentaBancaria {
    private int saldo;

    public CuentaBancaria(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public synchronized void depositar(int monto){
        saldo += monto;
    }
}
