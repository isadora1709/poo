package Aula01;

public class Conta {
    String titular;
    Integer numero_Conta;
    double saldo;

    void sacar(){
        this.saldo = this.saldo - 25
    }

    void depositar(){
        System.out.println("voce esta fazendo um deposito!");

    }

    void consultar(){
        System.out.println("Saldo R$:" + this.saldo);


    }
}
