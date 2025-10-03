public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("marca","modelo",2020,4);
        Carro carro2 = new Carro("marca","modelo",2023,2);
        Moto moto = new Moto("marca","modelo",2022,true);

        System.out.println("Carro 1-------------");
        carro.exibirInfo();

        System.out.println("\nCarro 2--------------");
        carro2.exibirInfo();

        System.out.println("\nMoto--------------");
        moto.exibirInfo();
    }
}