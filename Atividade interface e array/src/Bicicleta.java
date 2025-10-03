public class Bicicleta extends Transporte{
    public Bicicleta(String nome, String placa, int capacidadeCarga){
        super(nome,placa,capacidadeCarga);
    }

    @Override
    public void acelerar() {
        System.out.println("A bicicleta acelerou");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta freiou");
    }

}
