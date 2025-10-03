public class Quadrado implements FiguraGeometrica {
    int lado;

    public Quadrado(int lado){
        this.lado=lado;
    }

    public double calcularArea(){
        return lado*lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
