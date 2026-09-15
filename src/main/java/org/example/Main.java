package org.example;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria("Romulo", 20000);
        ContaBancaria conta2 = new ContaBancaria("Karen", 30000);


        System.out.println("Escolha uma conta: 1 - Conta1, 2 - Conta2");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Bem vindo " + conta1.nomeTitular );

            while (true) {

                System.out.println("Escolha uma opção: 1- Mostrar, 2- Sacar, 3- Depositar, 0- Sair");
                int escolha2 = scanner.nextInt();

                if (escolha2 == 1) {
                    conta1.apresentar();

                } else if (escolha2 == 2) {
                    System.out.println("Digite o valor que deseja sacar:");
                    double valorASacar = scanner.nextDouble();

                    conta1.sacar(valorASacar);

                } else if (escolha2 == 3) {
                    System.out.println("Digite o valor que deseja depositar:");
                    double valorDeposito = scanner.nextDouble();

                    conta1.depositar(valorDeposito);

                } else if (escolha2 == 0) {
                    System.out.println("Saindo da conta de " + conta1.nomeTitular);
                    break;

                } else {
                    System.out.println("Opção invalida");
                }
            }

        } else if (escolha == 2) {
            System.out.println("Bem vindo " + conta2.nomeTitular);

            while (true) {

                System.out.println("Escolha uma opção: 1- Mostrar, 2- Sacar, 3- Depositar, 0- Sair");
                int escolha2 = scanner.nextInt();

                if (escolha2 == 1) {
                    conta2.apresentar();

                } else if (escolha2 == 2) {
                    System.out.println("Digite o valor que deseja sacar:");
                    double valorASacar = scanner.nextDouble();

                    conta2.sacar(valorASacar);

                } else if (escolha2 == 3) {
                    System.out.println("Digite o valor que deseja depositar:");
                    double valorDeposito = scanner.nextDouble();

                    conta2.depositar(valorDeposito);

                } else if (escolha2 == 0) {
                    System.out.println("Saindo da conta de " + conta2.nomeTitular);
                    break;

                } else {
                    System.out.println("Opção invalida");
                }
            }

        }else {
            System.out.println("Conta inválida!");
        }

        System.out.println("Programa encerrado");
        scanner.close();
    }
}