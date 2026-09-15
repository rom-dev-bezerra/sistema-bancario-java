import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        // Cadastro das contas no sistema
        contas.add(new ContaBancaria(1000, "R@20", "Rômulo", 20000));
        contas.add(new ContaBancaria(1001, "K@24", "Karen", 30000));
        contas.add(new ContaBancaria(1002, "J@20", "Juan", 15000));
        contas.add(new ContaBancaria(1003, "K@05", "Ketlhem", 25000));
        contas.add(new ContaBancaria(1004, "A@19", "Amanda", 12000));

        System.out.println("=== Bem-vindo ao Banco Central ===");

        // Fluxo de Login
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite a senha: ");
        String senha = scanner.next();

        ContaBancaria contaAtiva = null;

        // Busca a conta correspondente na lista
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta && conta.getSenha().equals(senha)) {
                contaAtiva = conta;
                break; // Opcional: interrompe a busca ao encontrar a conta correta
            }
        }


        // Se o login foi bem-sucedido, entra no menu da conta
        if (contaAtiva != null) {
            System.out.println("\nBem-vindo, " + contaAtiva.getNomeTitular() + "!");

            while (true) {
                System.out.println("\nEscolha uma opção: 1- Mostrar, 2- Sacar, 3- Depositar, 4- Transferir, 0- Sair");
                System.out.print("Opção: ");
                int escolha2;

                try {
                    escolha2 = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Erro: Digite um número inteiro válido.");
                    scanner.nextLine(); // Limpa o buffer do teclado
                    continue;
                }

                switch (escolha2) {
                    case 1:
                        contaAtiva.apresentar();
                        break;

                    case 2:
                        System.out.print("Digite o valor do saque: R$ ");
                        double valorSaque = scanner.nextDouble();
                        contaAtiva.sacar(valorSaque);
                        break;

                    case 3:
                        System.out.print("Digite o valor do depósito: R$ ");
                        double valorDeposito = scanner.nextDouble();
                        contaAtiva.depositar(valorDeposito);
                        break;

                    case 4:
                        System.out.println("Digite o numero da conta de destino: ");
                        int contaDestino = scanner.nextInt();
                        ContaBancaria contaBancaria = null;
                        for (ContaBancaria conta : contas) {
                            if (conta.getNumeroConta() == contaDestino) {
                                contaBancaria = conta;
                                break;
                            }
                        }
                        if (contaBancaria == null) {
                            System.out.println("Erro: Conta de Destino não encontrada.");
                        } else if (contaBancaria.getNumeroConta() == contaAtiva.getNumeroConta()) {
                            System.out.println("Você não pode tranferir para você mesmo");
                        } else {
                            System.out.println("Digite o valor da tranferência: R$ ");
                            double valorTransferencia = scanner.nextDouble();

                            contaAtiva.transferir(contaBancaria, valorTransferencia);
                        }
                        break;

                    case 0:
                        System.out.println("Saindo do menu da conta...");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }

                if (escolha2 == 0) {
                    break; // Sai do menu interativo
                }
            }
        } else {
            // Mensagem caso o número ou senha estejam incorretos
            System.out.println("\nErro: Número da conta ou senha inválidos!");
        }

        System.out.println("\nPrograma encerrado. Obrigado por utilizar o Banco Central!");
        scanner.close();
    }
}
