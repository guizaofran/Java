package gerente;

import Trabalhavel.Trabalhavel;
import funcionarios.Funcionarios;

public class Gerente extends Funcionarios implements Trabalhavel {

    public Gerente(String nome, double salarioBase, int vendas) {
        super(nome,salarioBase,vendas);

    }

    public double pagamento() {
            double comissao = getVendas() * 3.50;
            return comissao+getSalarioBase();
    }

    @Override
    public String toString() {

        return "(Gerente)"+super.toString();
    }

    @Override
    public void trabalhar() {
        System.out.println("O(A) gerente " + getNome() + " está administrando a loja");

    }

    @Override
    public void relatarTarefas() {
        System.out.println("O(A) gerente " + getNome() + " está fazendo um relátorio mensal");

    }

}
