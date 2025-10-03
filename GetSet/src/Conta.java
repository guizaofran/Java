public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void depositar(double valor){
        if(valor<0){
            System.out.println("Não pode depositar número negativo");
        }else{
            saldo=+valor;
        }

    }
}
