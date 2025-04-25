package com.example.livraria.model;

// Importa JPA
import jakarta.persistence.*;

@Entity

public class Autor {

    @Id // Indica que o atributo será a chave primária do banco
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera automaticamente uma valor para o ID
    private Long id;
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
