package com.example.security.Services;

import com.example.security.Models.ProdutoModel;
import com.example.security.Repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAllProdutos() {
        return produtoRepository.findAll();
    }

    public ProdutoModel saveProdutos(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }
}
