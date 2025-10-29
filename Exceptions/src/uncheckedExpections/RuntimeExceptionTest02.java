package uncheckedExpections;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        //Exception - erros previsíveis, geralmente causados pelo programador ou ambiente
        //Unchecked (RuntimeException) - não é obrigatório tratar

        System.out.println(divisao(6, 0));
    }

    public static int divisao(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Argumento ilegal. Não é possível dividir por 0");
        }
        return 0;
    }
}
