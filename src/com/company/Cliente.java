package com.company;

public class Cliente {

    private Integer numeroDeCliente;
    private CuentaCorriente cuentaCorriente;
    private CajadeAhorro cajaDeAhorro;
    private  Double montoPrestado;

    public Cliente(Double saldoInicial, Integer numeroDeCliente) {
        cajaDeAhorro = new CajadeAhorro(0.00);
        cuentaCorriente = new CuentaCorriente(saldoInicial);
        this.numeroDeCliente = numeroDeCliente;
    }


    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public CajadeAhorro getCajadeahorro() {
        return cajaDeAhorro;
    }

    public void pedirPrestamo(Double montoPrestado){
        CajadeAhorro cajadeAhorro = getCajadeahorro();
        cajadeAhorro.depositar(montoPrestado);
    }

}
