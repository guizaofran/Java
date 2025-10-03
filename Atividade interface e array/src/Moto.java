public class Moto extends Transporte{
    public Moto(String nome,String placa, int capacidadeCarga){
        super(nome,placa,capacidadeCarga);
    }
    @Override
    public void acelerar() {
        System.out.println("A moto acelerou");
    }

    @Override
    public void frear() {
        System.out.println("A moto freiou");

    }
}
