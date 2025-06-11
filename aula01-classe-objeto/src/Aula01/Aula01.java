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
        
    }
}
