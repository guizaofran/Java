public class Veiculo {
    String marca;
    String modelo;
    int ano;

    // Construtor completo
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;   // uso do this
        this.modelo = modelo; // uso do this
        this.ano = ano;       // uso do this
    }

    // Construtor com valores padrão
    public Veiculo() {
        this("Sem marca", "Sem modelo", 2000);
    }

    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}