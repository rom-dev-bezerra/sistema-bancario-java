package org.example;

public class ContaBancaria {

    public String nomeTitular;
    public double saldo;

    public ContaBancaria(String nomeTitular, double saldo) {

        this.nomeTitular = nomeTitular;
        this.saldo = saldo;

    }

    public void apresentar() {
        System.out.printf("O seu saldo é: R$ %.2f reais%n", saldo);
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Deposito realizado com sucesso");
    }

    public void sacar(double valor2) {
        if (valor2 > saldo) {
            System.out.println("Saldo Insuficiente");
        } else {
            saldo = saldo - valor2;
            System.out.println("Saque Realizado");
        }
    }
}
