package br.com.tech4me.tech4plataforma.controller;

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

import br.com.tech4me.tech4plataforma.dto.PlataformaModeloResponse;
import br.com.tech4me.tech4plataforma.dto.PlataformaDto;
import br.com.tech4me.tech4plataforma.service.PlataformaService;

@RestController
@RequestMapping("/plataforma")
public class PlataformaController {
  
  @Autowired
  private PlataformaService service;

  @GetMapping
  public List<PlataformaDto> obterTodasAsPlataformas(){
      return service.obterTodasAsPlataformas();
  }

  @GetMapping("/{id}")
  public PlataformaDto obterPlataformaPorId(@PathVariable String id){
    return service.obterPorId(id);
  }

  @GetMapping("/nome/{nome}")
  public PlataformaDto obterPorDescricao(@PathVariable String descricao){
      return service.obterPorDescricao(descricao);
  }

  @GetMapping("/porta")
  public String retornaPorta(@Value("${local.server.port}") String porta){
    return String.format("Microsserviço atuando na porta %s", porta);
  }
  @GetMapping("/midia/{id}")
  public PlataformaModeloResponse buscartodasMidiasPlataforma(@PathVariable String id) {
    
    return service.buscartodasMidiasPlataforma(id);
  }
  @PostMapping
  public ResponseEntity<PlataformaDto> cadastrarPlataforma(@RequestBody @Valid PlataformaDto plataforma){
    return new ResponseEntity<>(service.cadastrarPlataforma(plataforma), HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public PlataformaDto alterarPlataforma(@PathVariable String id, @RequestBody PlataformaDto plataformaAlterar){
    return service.alterarPlataforma(id, plataformaAlterar);
  }

  @DeleteMapping("/{id}")
  public void excluirPlataforma(@PathVariable String id) {
    service.excluirPlataforma(id);
  } 

  

}
