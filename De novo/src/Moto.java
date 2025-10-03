public class Moto extends Veiculo{
    boolean partidaEletrica;

    public Moto(String marca, String modelo, int ano, boolean partidaEletrica){
        super(marca,modelo,ano);
        this.partidaEletrica=partidaEletrica;
    }

    public Moto(){
        this("Desconhecido","Desconhecido", 1000,false);
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Partida Eletrica: "+(this.partidaEletrica ? "Sim" : "Não"));
    }
}
