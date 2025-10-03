class Moto extends Veiculo {
    boolean partidaEletrica;

    // Construtor completo
    public Moto(String marca, String modelo, int ano, boolean partidaEletrica) {
        super(marca, modelo, ano);
        this.partidaEletrica = partidaEletrica;
    }

    // Construtor com valores padrão
    public Moto() {
        this("Sem marca", "Sem modelo", 2000, false);
    }

    // Método herdado + novo atributo
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Partida elétrica: " + (this.partidaEletrica ? "Sim" : "Não"));
    }
}
