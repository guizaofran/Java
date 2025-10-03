import java.util.Random;

public class Personagem {
    String nome;
    int inteligencia;
    int forca;

    public Personagem(String nome, int inteligencia, int forca) {
        this.nome = nome;
        this.inteligencia = inteligencia;
        this.forca = forca;
    }

    public Personagem() {
        this("Sem nome", 0, 0);
    }

    int calcularDano() {
        Random gerador = new Random();
        int d20 = 1 + gerador.nextInt(19);
        int dano = forca + d20;
        return dano;
    }

    public void atacar(String alvo, String habilidade) {
        int danoCausado = calcularDano();
        if (habilidade.length() == 0) {
            System.out.println(nome + " atacou " + alvo + " e causou " + danoCausado+ " de dano");
        } else {
            System.out.println(nome + " usou " + habilidade + " contra " + alvo + " e causou " +danoCausado+ " de dano");
        }
    }

    public void mostrarStatus() {
        System.out.println("Nome do personagem:" + nome);
        System.out.println("Inteligência do personagem:" + inteligencia);
        System.out.println("Força do personagem:" + forca);
    }
}
