package jogo;

import java.util.Random;

public abstract class Personagem {

    public abstract void atacar();

    protected int rolarDado() {
        Random gerador = new Random();
        return 1 + gerador.nextInt(6);
    }


}
