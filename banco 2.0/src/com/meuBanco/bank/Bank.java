package com.meuBanco.bank;

import com.meuBanco.conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String agencia;
    private String nome;
    private List<Conta> contas = new ArrayList<>();
    private int ultimaConta = 0;

    public Bank(String nome, String agencia) {
        this.nome = nome;
        this.agencia = agencia;
    }

    public Conta gerarConta(String nome) {
        Conta conta = new Conta(agencia, "" + ultimaConta, nome);
        ultimaConta++;
        return conta;
    }

    public void totalContas(){
        double total=0;
        for(Conta conta: contas){
            double saldo = conta.getSaldo();
            total+=saldo;
        }
        System.out.println("O banco "+nome+" possui um saldo total de: R$"+total);;
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public Bank() {
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
