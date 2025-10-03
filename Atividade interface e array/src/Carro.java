public class Carro extends Transporte{

    public Carro(String nome,String placa, int capacidadeCarga){
        super(nome, placa,capacidadeCarga);
    }
    @Override
    public void acelerar() {
        System.out.println("O carro acelerou");
    }

    @Override
    public void frear() {
        System.out.println("O carro freiou");

    }
}
