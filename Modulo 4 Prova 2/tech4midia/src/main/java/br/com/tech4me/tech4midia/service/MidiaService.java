package br.com.tech4me.tech4midia.service;

import java.util.List;

import javax.validation.Valid;

import br.com.tech4me.tech4midia.dto.MidiaDto;

public interface MidiaService {

    List<MidiaDto> obterTodasAsMidias();
    MidiaDto obterPorId(String id);
    MidiaDto obterPorDescricao(String descricao);
    List<MidiaDto> buscarTodasMidiasPlataforma(String id);
    MidiaDto alterarMidia(String id, MidiaDto midiaAlterar);
    void excluirMidia(String id);
    void excluirTodos();
    MidiaDto cadastrarMidia(@Valid MidiaDto midia);
    MidiaDto incluirMidia(MidiaDto midia);
    

}
