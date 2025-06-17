package com.springvibe.api.model.usuario;

public record DadosCadastroUsuario (
    String nome,
    String dataNascimento,
    String email,
    String senha,
    String cpf) {
    
}
