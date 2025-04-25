package com.example.livraria.repository;

// Importações necessárias
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.livraria.model.Autor;

// Anotação que indica que esta interface é um repositório do Spring
@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    // Esta interface herda métodos de JpaRepository para operações CRUD
    // Não é necessário adicionar métodos adicionais aqui, a menos que você precise de consultas personalizadas
}
