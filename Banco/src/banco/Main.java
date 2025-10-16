package banco;

import banco.bank.Bank;
import banco.conta.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank santader = new Bank("001");

        while (true) {
            System.out.println("C - Criar conta\nE - Sair");
            System.out.println("\nO que deseja fazer?");
            String opcao = scanner.nextLine();
            if (opcao.equals("C")) {
                System.out.println("Digite seu nome: ");
                String nome = scanner.nextLine();
                Conta conta = santader.gerarConta(nome);
                santader.inserirConta(conta);
                operarConta(conta);
            } else if (opcao.equals("E")) {
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
            scanner = new Scanner(System.in);
        }
        List<Conta> contaLista = santader.getContas();
        for (Conta lista : contaLista) {
            System.out.println(lista);
        }

        santader.totalContas();
    }

    static void operarConta(Conta conta) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("D - Depositar\nS - Sacar\nE - Sair");
            System.out.println("\nQual operação você deseja realizar?");
            String opcao = scanner.nextLine();

            if (opcao.equals("D")) {
                System.out.println("Qual valor deseja depositar?");
                double valor = scanner.nextDouble();
                ;
                conta.depositar(valor);
            } else if (opcao.equals("S")) {
                System.out.println("Qual valor deseja sacar?");
                double valor = scanner.nextDouble();
                ;
                conta.sacar(valor);
            } else if (opcao.equals("E")) {
                break;
            } else {
                System.out.println("Opção Inválida! Tente novamente.");
            }
            scanner = new Scanner(System.in);
        }
    }
}