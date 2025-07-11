package Aula02;

public class Conta {
    private String nometitular;
    private Integer numeroconta;
    private double saldo;
    private boolean status;

    public Conta(String nometitular, Integer numeroconta, double saldo) {
        this.nometitular = nometitular;
        this.numeroconta = numeroconta;
        this.saldo = saldo;
        this.status = true;

    }

    public void exibir() {
        System.out.println("========= dados bancarios ========");
        System.out.println("cliente:" + this.nometitular);
        System.out.println("numero da conta:" + this.numeroconta);
        System.out.println("conta esta ativa?" + getstatus());
        System.out.println("==============================");
    }

    public String Setnumeroconta(int novonumero){
        this.numeroconta = novonumero;
        return "numero da conta atualizado";
    }
    public boolean getstatus(){
        return this.status;
    }

    public void depositar(double valor) {
       this.saldo = this.saldo + valor;
    }

    public String sacar(double valor) {
        this.saldo = this.saldo - valor;
        return "saque realizado com sucesso!";
    }
}
