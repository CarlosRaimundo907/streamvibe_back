package com.springvibe.api.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

// Nome,data de nascimento. emai, senha, cpf => Tudo String
public class Usuario {
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private String cpf;
   
}
