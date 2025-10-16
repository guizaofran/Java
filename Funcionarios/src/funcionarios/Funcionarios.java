package funcionarios;

public abstract class Funcionarios {
    private String nome;
    private double salarioBase;
    private int vendas;

    public Funcionarios(String nome, double salarioBase, int vendas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.vendas = vendas;
    }

    public String toString() {
        if(vendas<0){
            return "'Vendas' não pode ser negativa!";
        }else {
            return nome + " - Salário base: R$" + salarioBase + "\nVendas: " + getVendas() + "\nPagamento total: R$" + pagamento();
        }
    }

    public double pagamento() {return 0;}

    public Funcionarios() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getVendas() {return vendas;}

    public void setVendas(int vendas) {
            this.vendas = vendas;
    }
}
