package Aula02;

public class Main {
    public static void main(String[] args) {
        Conta minhaconta = new Conta("kassio", 55443, 0.0);

        minhaconta.consultarsaldo();
        minhaconta.depositar(120.00);
        minhaconta.consultarsaldo();
        minhaconta.sacar(15.00);
    }
}
