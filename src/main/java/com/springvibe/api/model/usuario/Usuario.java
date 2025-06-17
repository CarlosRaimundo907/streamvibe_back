package com.springvibe.api.model.usuario;


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

    private int id;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private String cpf;

    public Usuario (DadosCadastroUsuario dados){
        this.nome = dados.nome();
        this.dataNascimento = dados.dataNascimento();
        this.email = dados.email();
        this.senha = dados.senha();
        this.cpf = dados.cpf();

    }
   
}
