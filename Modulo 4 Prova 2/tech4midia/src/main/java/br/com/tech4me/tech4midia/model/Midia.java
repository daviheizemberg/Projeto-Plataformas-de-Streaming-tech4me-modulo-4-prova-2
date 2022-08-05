package br.com.tech4me.tech4midia.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("midia")
public class Midia {
    
    @Id
    private String id;
    private String descricao;
    private String tipo;
    private String duracao;
    private String genero;
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
        return this.idPlataforma;
    }
    public void setIdPlataforma(String idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDuracao() {
        return this.duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    
    
}
