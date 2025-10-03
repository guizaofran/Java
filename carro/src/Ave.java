public class Ave extends Animais {

    public Ave(String nome) {
        super(nome);
    }

    public void voar() {
        System.out.printf("%s voou\n", getNome());
    }
}
