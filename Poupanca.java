package com.company.model;

public class Poupanca extends Conta{
    private int diaAniversario;

    public Poupanca(int numero, String nomeCliente, int diaAniversario) {
        super(numero, nomeCliente);
        this.diaAniversario = diaAniversario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Dia Aniversario: " + diaAniversario + "\n";
    }

    @Override
    public void pagarTaxaMensal() {
        System.out.println("Taxa mensal da poupanca");
    }
}
