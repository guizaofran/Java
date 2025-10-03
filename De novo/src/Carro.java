public class Carro extends Veiculo{
    int portas;

    public Carro(String marca, String modelo, int ano,int portas){
        super(marca,modelo,ano);
        this.portas=portas;
    }

    public Carro(){
        this("Desconhecido","Desconhecido", 1000,1);
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Portas: "+this.portas);
    }

    public void exibirInfo(String mensagem){
        System.out.println(mensagem);
        exibirInfo();
    }
}
