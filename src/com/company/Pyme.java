package com.company;

public class Pyme extends Cliente {

    private String razonSocial;
    private String cuit;

    public Pyme(Double saldoInicial, Integer numeroDeCliente, String razonSocial, String cuit) {
        super(saldoInicial, numeroDeCliente);
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }
}
