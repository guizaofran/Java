public class Gato extends Animais {

    public Gato(String nome){
        super(nome);
    }

    public void miar() {
        System.out.printf("%s miou\n", getNome());
    }
}
