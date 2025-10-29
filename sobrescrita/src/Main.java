import jogos.Arqueiro;
import jogos.Personagem;

public class Main {
    public static void main(String[] args) {

        Personagem personagem1 = new Personagem("Desconhecido");
        Arqueiro arqueiro1 = new Arqueiro("Legolas");

        System.out.println(personagem1);
        System.out.println(arqueiro1);

        arqueiro1.atacar();
        arqueiro1.atacarDesarmado();
    }
}