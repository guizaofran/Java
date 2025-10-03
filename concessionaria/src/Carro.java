class Carro extends Veiculo {
    int portas;

    // Construtor completo
    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano); // chama construtor da classe base
        this.portas = portas;
    }

    // Construtor com valores padrão
    public Carro() {
        this("Sem marca", "Sem modelo", 2000, 4);
    }

    // Sobrescrevendo exibirInfo()
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + this.portas);
    }

    // Sobrecarga de método exibirInfo
    public void exibirInfo(String mensagem) {
        System.out.println(mensagem);
        exibirInfo(); // chama o outro método
    }
}
