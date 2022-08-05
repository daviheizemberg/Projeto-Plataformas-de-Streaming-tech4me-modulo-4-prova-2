package br.com.tech4me.tech4plataforma.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("stream")
public class Plataforma {

    @Id
    private String id;
    private String descricao;
    private double mensalidade;
    private FormaPagamento formaPagamento;
    private double avaliacao;


    public String getId() {
        return this.id;
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
    public double getMensalidade() {
        return this.mensalidade;
    }
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    public FormaPagamento getFormaPagamento() {
        return this.formaPagamento;
    }
    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public double getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

}
