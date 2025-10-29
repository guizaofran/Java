package service;

import repository.ProdutoRepository;

public class RepositoryArquivo implements ProdutoRepository {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
