package jogo;

public class Guerreiro extends Personagem{

    @Override
    public void atacar() {
        int d6 = rolarDado();
        if(d6<3){
            System.out.println("O Guerreiro errou o ataque. Valor do dado: "+d6);
        }else if(d6==6){
            System.out.println("O Guerreiro acertou o golpe especial. Valor do dado: "+d6);
        }else{
            System.out.println("O Guerreiro acertou o ataque. Valor do dado: "+d6);
        }
    }
}
