package com.company;

public class Individuo extends Cliente{

    private String nombrerazonSocial;
    private String dni;

    public Individuo(Double saldoInicial, Integer numeroDeCliente, String nombrerazonSocial, String dni) {
        super(saldoInicial, numeroDeCliente);
        this.nombrerazonSocial = nombrerazonSocial;
        this.dni = dni;
    }
}
