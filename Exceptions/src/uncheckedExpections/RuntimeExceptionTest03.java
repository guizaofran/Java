package uncheckedExpections;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        //Exception - erros previsíveis, geralmente causados pelo programador ou ambiente
        //Unchecked (RuntimeException) - não é obrigatório tratar
        abreConexao();
        System.out.println("Programa continua");
    }

    private static void abreConexao() {
        try {
            System.out.println("Abrindo arquivo...");
            System.out.println("Escrevendo dados no arquivo...");
            throw  new RuntimeException();
        } catch(RuntimeException e){
            e.printStackTrace();
            System.out.println("Não foi possivel abrir arquivo!");
        } finally{
            System.out.println("Fechando o recurso liberado pelo sistema operacional...");
        }
    }


}
