package com.company.model;

import java.time.LocalDate;

public abstract class Conta {
    private int numero;
    private String nomeCliente;
    protected double saldo;
    private LocalDate dataAbertura;

    public Conta(int numero, String nomeCliente){
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.dataAbertura = LocalDate.now();
    }

    public void depositar(double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Valor invalido");
        }
        saldo += valor;
    }
    public void sacar(double valor){
        if(valor > saldo){
            throw new IllegalArgumentException("Sem saldo para saque");
        }
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "Num. Conta: " + numero + "\n" +
                "Nome Cliente: " + nomeCliente + "\n" +
                "Saldo: " + saldo + "\n" +
                "Abertura da Conta: " + dataAbertura + "\n";
    }

    public double getSaldo() {
        return saldo;
    }

    abstract void pagarTaxaMensal();
}
