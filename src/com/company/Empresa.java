package com.company;

public class Empresa extends Cliente {

    private String razonSocial;
    private String cuit;

    public Empresa(Double saldoInicial, Integer numeroDeCliente, String razonSocial, String cuit) {
        super(saldoInicial, numeroDeCliente);
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }

    @Override
    public void pedirPrestamo(Double montoPrestado) {
        super.pedirPrestamo(montoPrestado);
        System.out.println("El Cliente empresa no puede perdir prestamo");
    }
}
