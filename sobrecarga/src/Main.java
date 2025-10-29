import devflix.Filme;
import devflix.Video;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Matrix");
        filme.play();
        filme.play("português");
    }
}