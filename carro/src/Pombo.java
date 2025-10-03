public class Pombo extends Ave {

    public Pombo(String nome) {
        super(nome);
    }

    public void enviarCarta() {
        System.out.printf("%s entregou uma carta\n", getNome());
    }

    public void fazerPru() {
        System.out.printf("%s fez pruuh\n", getNome());
    }

}
