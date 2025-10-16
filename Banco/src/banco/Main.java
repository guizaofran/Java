package banco;

import banco.conta.Conta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta("001", "1234", "Guilherme");

        conta.depositar(100);
        conta.depositar(50);
        conta.depositar(-50);

        conta.sacar(100);
        conta.sacar(150);

        System.out.println(conta);

    }
}