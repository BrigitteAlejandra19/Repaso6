package com.company;

public class Main {


    public static void main(String[] args) {

        Cliente pablo = new Cliente(50.00,1);

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

        Pyme pyme = new Pyme(100.00,2, "123", "Pyme");
        CajadeAhorro cAPyme = pyme.getCajadeahorro();
        System.out.println("El saldo de la caja de ahorro de Pyme es: " +cAPyme.getSaldo());
        pyme.pedirPrestamo(100.0);
        System.out.println("El saldo de prestamo de Pyme es: " +pyme.getCajadeahorro().getSaldo());

        Individuo individuo = new Individuo(100.00,3, "456", "Individuo");
        CuentaCorriente cTeIndividuo = individuo.getCuentaCorriente();
        System.out.println("El saldo de la Cte de Individuo es: " +cTeIndividuo.getSaldo());

        Empresa empresa = new Empresa(100.0,3, "789", "Empresa");
        CajadeAhorro cAEmpresa = empresa.getCajadeahorro();
        empresa.pedirPrestamo(100.00);
        System.out.println("El saldo de la caja de ahorro de Empresa es: " +cAEmpresa.getSaldo());

    }
}
