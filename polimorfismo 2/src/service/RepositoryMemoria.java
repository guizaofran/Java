package service;

import repository.ProdutoRepository;

public class RepositoryMemoria implements ProdutoRepository {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
