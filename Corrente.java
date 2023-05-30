package com.company.model;

public class Corrente extends Conta {
    private double limite;

    public Corrente(int numero, String nomeCliente,double limite){
        super(numero, nomeCliente);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if(valor > (limite + saldo)){
            throw new IllegalArgumentException("Sem saldo e limite");
        }
        saldo -= valor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Limite: " + limite + "\n";
    }

    @Override
    public void pagarTaxaMensal() {
        System.out.println("taxa mensal da conta corrente");
    }
}
