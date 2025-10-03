public class Vilao extends Personagem{
    int crueldade;

    public Vilao(String nome, int inteligencia, int forca,int crueldade){
        super(nome,inteligencia,forca);
        this.crueldade=crueldade;
    }
    public Vilao(){
        this("Sem nome",0,0,0);
    }

    @Override
    public void mostrarStatus(){
        super.mostrarStatus();
        System.out.println("Crueldade do personagem: "+crueldade);
    }
}
