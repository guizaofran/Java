package jogos;

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.classe = "Nenhuma";
        this.nivel = 1;
    }

    @Override
    public String toString() {
        String informacoes = String.format("%s (Nível: %d) - Classe %s",nome,nivel,classe);
        return informacoes;
    }

    public final void atacarDesarmado(){
        System.out.println("O personagem "+nome+" atacou desarmado");
    }

    public void atacar(){
        System.out.println("O personagem "+nome+" atacou");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
