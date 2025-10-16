import Trabalhavel.Trabalhavel;
import funcionarios.Funcionarios;
import gerente.Gerente;
import vendedor.Vendedor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Carlos",5870.38,30));
        funcionarios.add(new Vendedor("João",2149.20,56));
        funcionarios.add(new Vendedor("Maria",1560.50,10));
        funcionarios.add(new Vendedor("Pedro",1934.78,17));


        for(Funcionarios lista: funcionarios){
            System.out.println(lista);
            ((Trabalhavel) lista ).trabalhar();
            ((Trabalhavel) lista ).relatarTarefas();
            System.out.println("---------------------");
        }


    }
}