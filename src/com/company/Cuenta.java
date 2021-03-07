package com.company;

public class Cuenta {
    private String moneda ="ARG";
    private Double saldoInicial;
    protected Double saldo = 0.00;


    public Cuenta(Double saldoInicial) {
        saldo = saldoInicial;
    }

    public Double getSaldo(){

        return saldo;
    }

    public void depositar(Double monto){

        saldo+= monto;
    }
    public void extraer(Double monto){

        saldo-= monto;
    }



}

