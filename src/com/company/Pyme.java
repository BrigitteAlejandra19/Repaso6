package com.company;

public class Pyme extends Cliente {

    private String razonSocial;
    private String cuit;


    public Pyme(Double saldoInicial, Integer numeroDeCliente, TipoCliente tipoCliente) {
        super(saldoInicial, numeroDeCliente, tipoCliente);
    }

    public Pyme(Double saldoInicial, Integer numeroDeCliente, TipoCliente tipoCliente, String razonSocial, String cuit) {
        super(saldoInicial, numeroDeCliente, tipoCliente);
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }
}
