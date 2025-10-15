package vendedor;

import Trabalhavel.Trabalhavel;
import funcionarios.Funcionarios;

public class Vendedor extends Funcionarios implements Trabalhavel {


    public Vendedor(String nome, double salarioBase, int vendas) {
        super(nome, salarioBase,vendas);
    }

    public double pagamento() {
            double comissao = getVendas() * 3.50;
            return comissao+getSalarioBase();
    }

    @Override
    public void trabalhar() {
        System.out.println("O(A) vendedor(a) " + getNome() + " está vendendo produtos");
    }

    @Override
    public void relatarTarefas() {
        System.out.println("O(A) vendedor(a) " + getNome() + " está fazendo um relatório de vendas");
    }

}
