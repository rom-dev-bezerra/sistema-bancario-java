public class ContaBancaria {
    private String nomeTitular;
    private double saldo;
    private int numeroConta;
    private String senha;

    public ContaBancaria( int numeroConta, String senha, String nomeTitular, double saldoInicial) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.senha = senha;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        }
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }
    public double getSaldo() { return this.saldo; }
    public String getSenha() {
        return this.senha;
    }
    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void transferir(ContaBancaria contaBancaria, double valor) {
        if (valor <= 0) {
            System.out.println("Valor de transferencia inválido.");
            return;
        }

        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaBancaria.depositarDeTransferencia(valor);
            System.out.println("Transferencia de: " + valor + " realizada com sucesso!");
        } else {
            System.out.println("Transferencia negada! Saldo insuficiente.");
        }
    }

    public void depositarDeTransferencia(double valor) {
        this.saldo += valor;
    }

    public void apresentar() {
        System.out.println("--- Dados da Conta ---");
        System.out.println("Titular: " + this.nomeTitular);
        System.out.println("Saldo atual: R$" + this.saldo);
    }
}