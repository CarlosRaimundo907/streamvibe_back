package com.springvibe.api.model.endereco;

    import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Endereco {
   
    private int id;
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String complemento;
    

    public Endereco (DadosCadastroEndereco dados) {
        this.rua = dados.rua();
        this.numero = dados.numero();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();
    

}
}
