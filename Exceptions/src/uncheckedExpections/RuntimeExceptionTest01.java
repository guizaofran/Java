package uncheckedExpections;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //Exception - erros previsíveis, geralmente causados pelo programador ou ambiente
        //Unchecked (RuntimeException) - não é obrigatório tratar

        System.out.println(divisao(6, 0));
    }

    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal. Não é possível dividir por 0");
        } else {
            return a / b;
        }
    }
}
