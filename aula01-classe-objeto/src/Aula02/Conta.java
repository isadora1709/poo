package Aula02;

public class Conta {
    private String nometitular;
    private Integer numeroconta;
    private double saldo;

    public Conta(String nometitular, Integer numeroconta, double saldo) {
        this.nometitular = nometitular;
        this.numeroconta = numeroconta;
        this.saldo = saldo;

    }

    public void consultarsaldo() {
        System.out.printf("saldo da conta: R$ %.2f \n", this.saldo);
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public String sacar(double valor) {
        this.saldo = this.saldo - valor;
        return "saque realizado com sucesso!";
    }
}