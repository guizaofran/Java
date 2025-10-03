
public class Main {
    public static void main(String[] args) {
        PingPong pingPong=new PingPong();
        Xadrez xadrez=new Xadrez();
        TiroAoAlvo tiroAoAlvo=new TiroAoAlvo();

        VideoGame playstation = new VideoGame();

        playstation.ligar();
        playstation.jogar(tiroAoAlvo);
        playstation.fechar();

        playstation.ligar();
        playstation.jogar(xadrez);



    }
}