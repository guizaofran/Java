package banco.conta;

import banco.log.Log;

public class Conta {
    private static final int MAX_LENTGH = 12;
    private String nome;
    private String agencia;
    private String conta;
    private double saldo;
    private Log logger = new Log();

    public Conta(String agencia, String conta, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        setNome(nome);

    }

    public Conta() {
    }

    public void sacar(double valor) {
        if (saldo < valor) {
            logger.saida("Você não tem saldo suficiente para sacar!");
        } else {
            saldo -= valor;
            logger.saida("SAQUE: R$" + valor + " - Saldo atual: R$" + saldo);
        }
    }

    public void depositar(double valor) {
        if (valor < 0) {
            logger.saida("Você não pode depositar valores negativos!");
        } else {
            saldo += valor;
            logger.saida("DEPÓSITO: R$" + valor + " - Saldo atual: R$" + saldo);
        }
    }

    @Override
    public String toString() {
        return "A conta " + nome + " " + agencia +"/" + conta + " possui: R$" + saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > MAX_LENTGH) {
            //substring define o tamanho da String dentro do range definido
            this.nome = nome.substring(0, MAX_LENTGH);
        } else {
            this.nome = nome;
        }
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
}
