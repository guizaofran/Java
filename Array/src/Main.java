import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoas guilherme = new Pessoas("Guilherme",19);
        Pessoas julio = new Pessoas("Julio",20);

        ArrayList<Pessoas> pessoas = new ArrayList<Pessoas>();
        pessoas.add(julio);
        pessoas.add(guilherme);

        for(Pessoas lista: pessoas){
            System.out.println(lista.getIdade());
        }


    }
}