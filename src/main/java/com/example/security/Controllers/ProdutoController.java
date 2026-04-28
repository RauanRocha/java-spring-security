package com.example.security.Controllers;

import com.example.security.Models.ProdutoModel;
import com.example.security.Services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoModel> saveProduto(ProdutoModel produtoModel) {
        ProdutoModel newItem = produtoService.saveProdutos(produtoModel);

        if(newItem != null) {
            return ResponseEntity.ok(newItem);
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> findAllProduto() {
        return ResponseEntity.ok(produtoService.findAllProdutos());
    }
}
