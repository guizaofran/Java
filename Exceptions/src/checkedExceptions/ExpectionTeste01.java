package checkedExceptions;

import java.io.File;
import java.io.IOException;

public class ExpectionTeste01 {
    public static void main(String[] args) {
        //Exception - erros previsíveis, geralmente causados pelo programador ou ambiente
        // Checked - o compilador obriga tratar (try/catch ou throws)

        criarNovoArquivo();
    }

    public static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {
            file.createNewFile();
            System.out.println("Arquivo criado com sucesso");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Arquivo não criado");
        }
    }
}
