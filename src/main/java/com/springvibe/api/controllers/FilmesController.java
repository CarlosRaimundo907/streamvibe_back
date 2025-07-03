package com.springvibe.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springvibe.api.model.filme.DadosAtualizacaoFilme;
import com.springvibe.api.model.filme.DadosCadastroFilme;
import com.springvibe.api.model.filme.Filme;
import com.springvibe.api.model.filme.FilmeRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/filme")
public class FilmesController {

    // Injeção de depedência
    @Autowired
    private FilmeRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarFilme(@RequestBody DadosCadastroFilme dados) {
        repository.save(new Filme(dados));
    }

// // AQUI FICA O READ
    @GetMapping
    public List<Filme> listarFilmes() {
        return repository.findAll();
    }

// // AQUI FICA O UPDATE
    @PutMapping
    @Transactional
    public void atualizarFilme(@RequestBody DadosAtualizacaoFilme dados){
        var filme = repository.getReferenceById(dados.id());
        filme.atualizarInformacoes(dados);

    }


    // Aqui fica o DELETE REAL
    @DeleteMapping("/{id}")
    @Transactional
    public void excluirFilmeReal(@PathVariable Integer id) {
        repository.deleteById(id);
    } 

//     // Aqui vai ficar a Exclusão Lógica;
//         @DeleteMapping("/{id}")
//         @Transactional
//         public void excluirFilmeLogico(@PathVariable Integer id){
//             var filme = repository.getReferenceById(id);
//             filme.exclusaoLogica();
       }

