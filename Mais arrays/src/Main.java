import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList();

        produtos.add("maçã");
        produtos.add("aveia");
        produtos.add("leite");
        produtos.add("frango");

        //imprime array
        for(String compras: produtos){
            System.out.println(compras);
        }

        //descobre o indice do elemento
        System.out.println(produtos.indexOf("leite"));

        //diz se a lista está fazia
        System.out.println(produtos.isEmpty());

        //verifica se a lista possui tal elemento
        System.out.println(produtos.contains("frango"));

        //quantos elementos tem na lista
        System.out.println(produtos.size());

        //limpar a lista
        produtos.clear();
        System.out.println(produtos.isEmpty());
    }
}