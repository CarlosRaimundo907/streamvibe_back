package com.springvibe.api.model.filme;

public record DadosCadastroFilme(
    String nome,
    String estudio,
    double duracao,
    String imagem,
    Genero genero,
    String diretor,
    String elenco,
    String sinopse) {
    
}
