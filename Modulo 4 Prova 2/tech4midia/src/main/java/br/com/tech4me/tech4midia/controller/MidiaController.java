package br.com.tech4me.tech4midia.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.tech4midia.dto.MidiaDto;
import br.com.tech4me.tech4midia.service.MidiaService;

@RestController
@RequestMapping("/midia")
public class MidiaController {
  
  @Autowired
  private MidiaService service;

  @GetMapping
  public List<MidiaDto> obterTodasAsMidias(){
      return service.obterTodasAsMidias();
  }

  @GetMapping("/{id}")
  public MidiaDto obterMidiaPorId(@PathVariable String id){
    return service.obterPorId(id);
  }

  @GetMapping("/nome/{nome}")
  public MidiaDto obterPorDescricao(@PathVariable String descricao){
      return service.obterPorDescricao(descricao);
  }
  
  @GetMapping("/porta")
  public String retornaPorta(@Value("${local.server.port}") String porta){
    return String.format("Microsserviço atuando na porta %s", porta);
  }
  @GetMapping("/plataforma/{id}")
  public List<MidiaDto> buscarTodasMidiasPlataforma(@PathVariable String id){
    return service.buscarTodasMidiasPlataforma(id);
  }

  @PostMapping
  public ResponseEntity<MidiaDto> cadastrarMidia(@RequestBody @Valid MidiaDto midia){
    return new ResponseEntity<>(service.cadastrarMidia(midia), HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public MidiaDto alterarMidia(@PathVariable String id, @RequestBody MidiaDto midiaAlterar){
    return service.alterarMidia(id, midiaAlterar);
  }

  @DeleteMapping("/{id}")
  public void excluirMidia(@PathVariable String id) {
    service.excluirMidia(id);
  } 
  @DeleteMapping("/deletartodos")
  public void excluirTodos(){
    service.excluirTodos();
  }

}

