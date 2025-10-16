package banco.bank;

import banco.conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String agencia;
    private List<Conta> contas = new ArrayList<>();
    private int ultimaConta;

    public List<Conta> getContas() {
        return contas;
    }

    public Bank(String agencia) {
        this.agencia = agencia;
    }

    public void inserirConta(Conta conta) {
        contas.add(conta);
    }

    public void totalContas() {
        double total = 0;
        for (Conta conta : contas) {
            double saldo = conta.getSaldo();
            total+=saldo;
        }
        System.out.println("O banco possui o valor de: R$"+total);
    }

    public Conta gerarConta(String nome) {
        Conta conta = new Conta(agencia, "" + ultimaConta, nome);
        ultimaConta++;
        return conta;
    }
}
