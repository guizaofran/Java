public class Dragao extends Ave {
    public Dragao(String nome){
        super(nome);
    }

    public void soltarFogo() {
        System.out.printf("%s cuspiu fogo\n",getNome());
    }
}
