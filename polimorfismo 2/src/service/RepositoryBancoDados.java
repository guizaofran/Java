package service;

import repository.ProdutoRepository;

public class RepositoryBancoDados implements ProdutoRepository {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
