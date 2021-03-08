package com.company;

public class Cliente {

    private Integer numeroDeCliente;
    private CuentaCorriente cuentaCorriente;
    private CajadeAhorro cajaDeAhorro;
    private  Double montoPrestado = 0.00;
    private  Double montoAdeudado = 0.00;
    private TipoCliente tipoCliente;

    public Cliente(Double saldoInicial, Integer numeroDeCliente, TipoCliente tipoCliente) {
        cajaDeAhorro = new CajadeAhorro(0.00);
        cuentaCorriente = new CuentaCorriente(saldoInicial);
        this.numeroDeCliente = numeroDeCliente;
        this.tipoCliente = tipoCliente;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public CajadeAhorro getCajadeahorro() {
        return cajaDeAhorro;
    }

    public void pedirPrestamo(Double monto){
        CajadeAhorro cajadeAhorro = getCajadeahorro();
        if ((monto<=100 && tipoCliente.equals(TipoCliente.RIESGOSO)) ||
           (monto<=200 && tipoCliente.equals(TipoCliente.NUEVO)) ||
           (monto<=500 && tipoCliente.equals(TipoCliente.CONFIABLE))){
           montoPrestado = monto;
            montoAdeudado = monto;
           cajadeAhorro.depositar(montoPrestado);
    }else
            System.out.println("Limite no disponible!!");

    }

    public void pagarPrestamo(Double montoAPagar){
        CajadeAhorro cajadeAhorro = getCajadeahorro();
        if (montoAPagar <= montoAdeudado){
            String tipoPago = "Parcial";
            if(montoAPagar.equals(montoPrestado)) {
                tipoPago = "Total";
                tipoCliente = TipoCliente.CONFIABLE;
            }
            cajadeAhorro.depositar(montoAPagar);
            System.out.println("Ha realizado un pago: " + tipoPago );
            montoAdeudado -= montoAPagar;
            System.out.println("Monto adeudado: "+ montoAdeudado);

        }
        System.out.println("No hay nada que pagar");

    }
        public Double consultarPrestamo() {
            return montoAdeudado;
        }


}
