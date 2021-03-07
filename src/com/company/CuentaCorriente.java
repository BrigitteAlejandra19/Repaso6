package com.company;

public class CuentaCorriente extends Cuenta {

    private static final Double descubierto = 5000.00;


    public CuentaCorriente(Double saldoInicial) {
        super(saldoInicial);
    }

    public static Double getDescubierto() {
        return descubierto;
    }



    @Override
    public void extraer(Double monto) {
        if (monto >= (saldo + descubierto))
            return;
        super.extraer(monto);
    }
}
