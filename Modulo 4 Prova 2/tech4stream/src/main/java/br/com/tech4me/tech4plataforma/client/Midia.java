package br.com.tech4me.tech4plataforma.client;


public class Midia {

    private String id;
    private String descricao;
    private String tipo;
    private String duracao;
    private String genero;
    private String idPlataforma;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getIdPlataforma() {
        return idPlataforma;
    }
    public void setIdPlataforma(String idPlataforma) {
        this.idPlataforma = idPlataforma;
    }
    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
    
}
