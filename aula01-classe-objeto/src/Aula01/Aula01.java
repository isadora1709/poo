package Aula01;

public class Aula01
{
    public static void main(String[] args) {
        Carro car01 = new Carro();

        car01.marca = "Toyota";
        car01.cor = "Preto";
        car01.ano = 2014;
        car01.modelo = "Corolla Cross";
        car01.potencia = 120;

        System.out.println();

        car01.ligar();

        car01.desligar();


        Conta Conta1 = new Conta();

        Conta1.numero_Conta = 123456;
        Conta1.saldo = 1800;
        Conta1.titular = "Castiel";

        System.out.println("cliente:" + Conta1.titular);
        System.out.println("numero da conta:" + Conta1.numero_Conta);
        System.out.println("Saldo da conta R$:" + Conta1.saldo);

        Conta1.sacar();
        Conta1.depositar();
        Conta1.consultar();

    }
}
