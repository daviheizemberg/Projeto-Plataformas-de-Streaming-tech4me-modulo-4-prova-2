package br.com.tech4me.tech4plataforma.dto;

import java.util.List;

import br.com.tech4me.tech4plataforma.client.Midia;

public class PlataformaModeloresponseComMidias extends PlataformaModeloResponse{
    List<Midia> midias;

    public List<Midia> getMidias() {
        return midias;
    }

    public void setMidias(List<Midia> midias) {
        this.midias = midias;
    }
}
