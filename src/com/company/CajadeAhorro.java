package com.company;

public class CajadeAhorro extends Cuenta {


    public CajadeAhorro(Double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void extraer(Double monto) {
        if (monto <= saldo)
        super.extraer(monto);
    }
}
