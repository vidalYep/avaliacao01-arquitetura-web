package com.example.livraria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.livraria.model.Autor;
import com.example.livraria.repository.AutorRepository;

@Service
public class AutorService {
    
    @Autowired
    private AutorRepository autorRepository;

    public Autor salvar(Autor autor) {
        return autorRepository.save(autor);
    }

    public List<Autor> listarTodos() {
        return autorRepository.findAll();
    }

    public Optional<Autor> buscarPorId(Long id) {
        return autorRepository.findById(id);
    }

    public Autor atualizar(Long id, Autor novoAutor) {
        return autorRepository.findById(id).map(autor -> {
            autor.setNome(novoAutor.getNome());
            return autorRepository.save(autor);
        }).orElseThrow(() -> new RuntimeException("Autor não encontrado"));
    }

    public void deletar(Long id) {
        autorRepository.deleteById(id);
    }
}
