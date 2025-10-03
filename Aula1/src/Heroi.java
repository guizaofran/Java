public class Heroi extends Personagem{
    int bondade;

    public Heroi(String nome, int inteligencia, int forca,int bondade){
        super(nome,inteligencia,forca);
        this.bondade=bondade;
    }
    public Heroi(){
        this("Sem nome",0,0,0);
    }

    @Override
    public void mostrarStatus(){
        super.mostrarStatus();
        System.out.println("Bondade do personagem: "+bondade);
    }

}
