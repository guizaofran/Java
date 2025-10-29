package error;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        //erro na JVM. Não pode ser tratado
        loop();
    }

    public static void loop() {
        loop();
    }

}