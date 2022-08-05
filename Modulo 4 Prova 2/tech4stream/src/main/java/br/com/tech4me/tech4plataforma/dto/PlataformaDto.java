package br.com.tech4me.tech4plataforma.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class PlataformaDto {

    private String id;
    @Size(min = 3, message = "A descrição deve conter ao menos 3 caracteres")
    private String descricao;
    @Positive
    private double mensalidade;
    @NotNull(message = "O campo é obrigatório")
    private String formaPagamento;
    @Positive
    private double avaliacao;

    
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
    public double getMensalidade() {
        return mensalidade;
    }
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public double getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
}
