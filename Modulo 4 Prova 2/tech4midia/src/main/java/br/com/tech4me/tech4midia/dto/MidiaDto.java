package br.com.tech4me.tech4midia.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class MidiaDto {
    
    private String id;
    @Size(min = 3, message = "A descrição deve conter ao menos 3 caracteres")
    @NotBlank(message = "O campo deve ser informado")
    private String descricao;
    private String tipo;
    private String duracao;
    @Size(min = 5, message = "O gênero deve conter ao menos 3 caracteres")
    private String genero;
    @Positive
    private double nota;
    private String idPlataforma;

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getNota() {
        return this.nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public String getIdPlataforma() {
        return idPlataforma;
    }
    public void setIdPlataforma(String idPlataforma) {
        this.idPlataforma = idPlataforma;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    
}
