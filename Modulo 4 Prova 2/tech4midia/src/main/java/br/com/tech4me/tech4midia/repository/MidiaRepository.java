package br.com.tech4me.tech4midia.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.tech4midia.model.Midia;

public interface MidiaRepository extends MongoRepository<Midia, String> {

    Midia findByDescricao(String descricao);
    List<Midia> findByIdPlataforma(String idPlataforma);
}
