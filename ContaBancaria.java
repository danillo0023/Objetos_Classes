package classes_objetos.exercicio2;

public class ContaBancaria {
    private int numeroConta;
    private String nome;
    private double saldo;


    public ContaBancaria(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void realizaDeposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: Valor do depósito inválido.");
        }
    }

    public void realizaSaque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: Saldo insuficiente para saque.");
        }
    }
    @Override
    public String toString() {
        return "Conta Bancária: \n" +
                "Número da conta: " + numeroConta + "\n" +
                "Nome do titular: " + nome + "\n" +
                "Saldo: R$" + String.format("%.2f", saldo);
    }
}
