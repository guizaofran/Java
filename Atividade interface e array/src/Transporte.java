public abstract class Transporte implements Veiculo{
    private String placa;
    private int capacidadeCarga;
    private String nome;


    public Transporte(String nome, String placa, int capacidadeCarga){
        this.nome=nome;
        this.placa=placa;
        this.capacidadeCarga=capacidadeCarga;
    }


    public void eixibirInfo(){
        System.out.println("Tipo de veiculo: "+nome);
        System.out.println("Placa: "+placa);
        System.out.println("Capacidade de carga: "+capacidadeCarga+"kg");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }


}
