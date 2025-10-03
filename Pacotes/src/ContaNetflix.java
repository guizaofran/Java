public class ContaNetflix {
    private String idiomaPreferencial;
    private String resolucaoTela;

    public ContaNetflix(String idiomaPreferencial, String resolucaoTela) {
        this.idiomaPreferencial = idiomaPreferencial;
        this.resolucaoTela = resolucaoTela;
    }

    public ContaNetflix(){
        this("","");
    }

    public void entrar() {
        idiomaDoUsuario();
        identificarResolucao();
    }

    private void idiomaDoUsuario() {
        idiomaPreferencial = "Português - Brasil";
    }

    private void identificarResolucao() {
        resolucaoTela = "4K";
    }

    private void carregarIdioma() {
        if (idiomaPreferencial == "Português - Brasil" || idiomaPreferencial == "Inglês") {
            System.out.println("Idioma definido para: " + idiomaPreferencial);
        } else {
            System.out.println("Idioma definido para Áudio Original");
        }
    }

    public void assistirFilme(String nomeFilme) {
        System.out.println("Iniciando o filme: " + nomeFilme);
        System.out.println("Resolução da imagem: " + resolucaoTela);
        carregarIdioma();
    }


}
