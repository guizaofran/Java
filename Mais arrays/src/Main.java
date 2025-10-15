import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList();

        produtos.add("4- maçã");
        produtos.add("1- aveia");
        produtos.add("3- leite");
        produtos.add("2- frango");

        Collections.sort(produtos);

        //imprime array
        for(String compras: produtos){
            System.out.println(compras);
        }

        //descobre o indice do elemento
        System.out.println(produtos.indexOf("3- leite"));

        //diz se a lista está vazia
        System.out.println(produtos.isEmpty());

        //verifica se a lista possui tal elemento
        System.out.println(produtos.contains("2- frango"));

        //quantos elementos tem na lista
        System.out.println(produtos.size());

        //limpar a lista
        produtos.clear();
        System.out.println(produtos.isEmpty());
    }
}