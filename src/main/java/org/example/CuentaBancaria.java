package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class CuentaBancaria {
    private final AtomicInteger saldo;

    public CuentaBancaria(int saldo){
        this.saldo = new AtomicInteger(saldo);
    }

    public int getSaldo(){
        return saldo.intValue();
    }

    public void depositar(int monto){
        saldo.addAndGet(monto);
    }
}
