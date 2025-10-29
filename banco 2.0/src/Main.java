import com.meuBanco.bank.Bank;
import com.meuBanco.conta.Conta;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank itau = new Bank("Itaú", "001");

        while (true) {
            System.out.println("Qual operação deseja realizar?");
            System.out.println("1 - Criar conta\n2 - Listar contas\n3 - Sair");
            System.out.println("\nEscolha a opção desejada: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {

                System.out.println("Digite seu nome: ");
                scanner.nextLine();
                String nome = scanner.nextLine();
                Conta conta = itau.gerarConta(nome);
                itau.adicionarConta(conta);
                operarConta(conta);
            } else if (opcao == 2) {
                List<Conta> contasLista = itau.getContas();
                for (Conta lista : contasLista) {
                    System.out.println(lista);
                }
               itau.totalContas();
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
            scanner = new Scanner(System.in);
        }

    }

    static void operarConta(Conta conta) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Qual operação deseja realizar?");
            System.out.println("1 - Depósito\n2 - Saque\n3 - Voltar");
            System.out.println("\nEscolha a opção desejada: ");
            int opcao = scanner.nextInt();
            if(opcao==1){
                System.out.println("Quanto deseja depositar? ");
                double valor = scanner.nextDouble();
                conta.depositar(valor);
            }else if(opcao==2){
                System.out.println("Quanto deseja sacar? ");
                double valor = scanner.nextDouble();
                conta.sacar(valor);
            }else if(opcao==3){
                break;
            }else{
                System.out.println("Opção inválida! Tente novamente.");
            }
            scanner = new Scanner(System.in);
        }

    }
}