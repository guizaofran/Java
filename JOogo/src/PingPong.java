public class PingPong implements Jogo{
    @Override
    public void fechar() {
        System.out.println("Salvando progresso do jogo");
        System.out.println("Fechar o jogo");
    }

    @Override
    public void jogar() {
        System.out.println("Cutscene inicial")  ;
        System.out.println("Mostrando menu inicial");
        System.out.println("Música de fundo");
    }
}
