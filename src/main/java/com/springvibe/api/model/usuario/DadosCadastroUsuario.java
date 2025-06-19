package com.springvibe.api.model.usuario;

import com.springvibe.api.model.endereco.DadosCadastroEndereco;

public record DadosCadastroUsuario(
    String nome,
    String dataNascimento,
    String email,
    String senha,
    String cpf,
    DadosCadastroEndereco endereco 

    ) {
    
}
