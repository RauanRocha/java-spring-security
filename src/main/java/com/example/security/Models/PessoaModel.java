package com.example.security.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany
    private List<JobModel> jobModelList;
}
