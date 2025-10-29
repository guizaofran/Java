import jogo.Guerreiro;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro();

        guerreiro.atacar();
        guerreiro.atacar();
        guerreiro.atacar();
        guerreiro.atacar();
        guerreiro.atacar();
        System.out.println(guerreiro.rolarDado());

    }
}