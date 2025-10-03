public class VideoGame {
    private Jogo jogo;
    private boolean estaLigado;

    public void ligar() {
        System.out.println("Ligando o videogame...");
        this.estaLigado = true;
    }

    public void jogar(Jogo jogo) {
        if (estaLigado == true) {
            System.out.println("Iniciando o jogo...");
            this.jogo = jogo;
            jogo.jogar();
        } else {
            System.out.println("Videogame está desligado");
        }

    }

    public void fechar() {
        if (estaLigado == true) {
            System.out.println("Desligando o videogame...");
            if (jogo != null) {
                jogo.fechar();
                jogo = null;
            } else {
                System.out.println("Nenhum jogo está aberto");
            }
        } else {
            System.out.println("Videogame está desligado");
        }
    }
}
