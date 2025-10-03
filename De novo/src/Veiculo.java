public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano){
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
    }

    public Veiculo(){
        this("Desconhecido","Desconhecido", 1000);
    }

    public void exibirInfo(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
    }
}
