public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Princesa");
        Gato gato = new Gato("Armagedon");
        Dragao dragao = new Dragao("Banguela");
        Pombo pombo = new Pombo("Sedex");

        cachorro.comer();
        cachorro.beber();
        cachorro.latir();

        System.out.print("\n");

        gato.miar();
        gato.comer();
        gato.beber();

        System.out.print("\n");

        pombo.beber();
        pombo.fazerPru();
        pombo.enviarCarta();
        pombo.voar();
        pombo.comer();

        System.out.print("\n");

        dragao.soltarFogo();
        dragao.voar();
        dragao.beber();
        dragao.comer();
    }
}