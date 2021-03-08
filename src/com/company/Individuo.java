package com.company;

public class Individuo extends Cliente{

    private String nombrerazonSocial;
    private String dni;


    public Individuo(Double saldoInicial, Integer numeroDeCliente, TipoCliente tipoCliente) {
        super(saldoInicial, numeroDeCliente, tipoCliente);
    }

    public Individuo(Double saldoInicial, Integer numeroDeCliente, TipoCliente tipoCliente, String nombrerazonSocial, String dni) {
        super(saldoInicial, numeroDeCliente, tipoCliente);
        this.nombrerazonSocial = nombrerazonSocial;
        this.dni = dni;
    }
}
