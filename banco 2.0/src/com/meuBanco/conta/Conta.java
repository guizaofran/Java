package com.meuBanco.conta;

import com.meuBanco.log.Log;

public class Conta {
    private static final int MAX_LENTGH = 12;
    private String agencia;
    private String conta;
    private String nome;
    private double saldo;
    private Log logger = new Log();

    public Conta(String agencia, String conta, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        setNome(nome);
    }

    @Override
    public String toString() {
        return "A conta " + nome + " " + agencia + "/" + conta + " possui o saldo de R$" + saldo;
    }

    public void sacar(double valor){
        if(valor>saldo){
            logger.saida("Você não pode sacar valores maiores que o seu saldo!");
        }else{
            saldo-=valor;
            logger.saida("SAQUE: R$"+valor+ " - Saldo atual: R$"+saldo);
        }
    }

    public void depositar(double valor){
        if(valor<0){
            logger.saida("Você não pode depositar valores negativos!");
        }else{
            saldo+=valor;
            logger.saida("DÉPOSITO: R$"+valor+ " - Saldo atual: R$"+saldo);
        }
    }

    public Conta() {}

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) { this.agencia = agencia; }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() { return saldo; }

    public void setNome(String nome) {
        if (nome.length() > 12) {
            this.nome = nome.substring(0, MAX_LENTGH);
        } else {
            this.nome = nome;
        }
    }
}
