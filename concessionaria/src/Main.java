public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 4);
        Carro carro2 = new Carro("Honda", "Civic", 2019, 2);
        Moto moto1 = new Moto("Yamaha", "MT-07", 2021, true);

        System.out.println("== Carro 1 ==");
        carro1.exibirInfo();

        System.out.println("\n== Carro 2 ==");
        carro2.exibirInfo("Exibindo informações do carro 2:");

        System.out.println("\n== Moto 1 ==");
        moto1.exibirInfo();
    }
}