package com.company;

public class Main {


    public static void main(String[] args) {

        Cliente pablo = new Cliente(50.00,1,TipoCliente.RIESGOSO);

        CajadeAhorro cAPablo = pablo.getCajadeahorro();
        CuentaCorriente cTePablo = pablo.getCuentaCorriente();

        cAPablo.depositar(100.00);
        cAPablo.extraer(50.00);
        Double saldoCA = cAPablo.getSaldo();

        System.out.println("El saldo de la caja de ahorro de Pablo es: " +saldoCA);

        cTePablo.depositar(200.00);
        cTePablo.extraer(100.00);
        Double saldoCte = cTePablo.getSaldo();
        System.out.println("El saldo de la cuenta corriente  de Pablo es: " +saldoCte);

        Pyme pyme = new Pyme(100.00,2, TipoCliente.NUEVO, "123", "pyme");
        CajadeAhorro cAPyme = pyme.getCajadeahorro();
        System.out.println("El saldo de la caja de ahorro de Pyme es: " +cAPyme.getSaldo());
        pyme.pedirPrestamo(100.0);
        pyme.pagarPrestamo(100.00);

        System.out.println("El saldo de prestamo de Pyme es: " +pyme.getCajadeahorro().getSaldo());

        Individuo individuo = new Individuo(100.00,3,TipoCliente.RIESGOSO, "456", "Individuo");
        CuentaCorriente cTeIndividuo = individuo.getCuentaCorriente();
        System.out.println("El saldo de la Cte de Individuo es: " +cTeIndividuo.getSaldo());
        System.out.println("Individuo es un tipo de Cliente " +individuo.getTipoCliente());
        individuo.pedirPrestamo(100.0);
        individuo.pagarPrestamo(100.00);
        System.out.println("El saldo de la Cte de Individuo es: " +cTeIndividuo.getSaldo());
        System.out.println("Individuo es un tipo de Cliente " +individuo.getTipoCliente());

        Empresa empresa = new Empresa(100.0,3,TipoCliente.CONFIABLE, "789", "Empresa");
        CajadeAhorro cAEmpresa = empresa.getCajadeahorro();
        empresa.pedirPrestamo(100.00);
        System.out.println("El saldo de la caja de ahorro de Empresa es: " +cAEmpresa.getSaldo());

    }
}
