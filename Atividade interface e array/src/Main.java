import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transporte> frota= new ArrayList<>();

        frota.add(new Carro("Carro","DFG439",100));
        frota.add(new Moto("Moto","OIS572",50));
        frota.add(new Bicicleta("Bicicleta","ASH098",10));

        for(Transporte i: frota){
            i.eixibirInfo();
            i.acelerar();
            i.frear();
            System.out.println("----------------");
        }


    }
}