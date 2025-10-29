package test;

import model.Computador;
import model.Televisao;
import model.Tomate;
import repository.ProdutoRepository;
import service.CalculadoraImposto;
import service.RepositoryArquivo;
import service.RepositoryBancoDados;

import java.util.ArrayList;
import java.util.List;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("NoteBook Intel i5 10400f",4700);
        Televisao tv = new Televisao("TV Samsung 4K 55\"",3500);
        Tomate tomate = new Tomate("Tomate siciliano",4);
        tomate.setDataValidade("04/11/2025");

        ProdutoRepository repositorio = new RepositoryArquivo();

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(tv);
        System.out.println("-----------------------------");
        repositorio.salvar();
    }
}