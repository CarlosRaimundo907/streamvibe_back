package com.springvibe.api.model.filme;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // permite a utilização unica e exclusiva para cada filme//
    private Integer id;

    private String nome;
    private String estudio;
    private double duracao;
    private String imagem;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    private String diretor;
    private String elenco;
    private String sinopse;

    public Filme (DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.estudio = dados.estudio();
        this.duracao = dados.duracao();
        this.imagem = dados.imagem();
        this.genero = dados.genero();
        this.diretor = dados.diretor();
        this.elenco = dados.elenco();
        this.sinopse = dados.sinopse();
    }

}
