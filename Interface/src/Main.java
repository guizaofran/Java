public class Main {
    public static void main(String[] args) {
        Circulo circuloP = new Circulo(5);
        Quadrado quadradoP = new Quadrado(10);

        System.out.println(circuloP.calcularArea());
        System.out.println(quadradoP.calcularArea());
    }
}