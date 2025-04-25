package com.example.livraria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.livraria.model.Livro;
import com.example.livraria.repository.LivroRepository;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public Livro salvar(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro> listarTodos() {
        return livroRepository.findAll();
    }

    public Livro atualizar(Long id, Livro novoLivro) {
        return livroRepository.findById(id).map(livro -> {
            livro.setTitulo(novoLivro.getTitulo());
            livro.setPreco(novoLivro.getPreco());
            livro.setAutor(novoLivro.getAutor());
            return livroRepository.save(livro);
        }).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }

    public void deletar(Long id) {
        livroRepository.deleteById(id);
    }
}
