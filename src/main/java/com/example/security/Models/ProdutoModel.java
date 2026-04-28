package com.example.security.Models;

import jakarta.persistence.*;

@Entity
@Table(name="Produto_TBL")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
