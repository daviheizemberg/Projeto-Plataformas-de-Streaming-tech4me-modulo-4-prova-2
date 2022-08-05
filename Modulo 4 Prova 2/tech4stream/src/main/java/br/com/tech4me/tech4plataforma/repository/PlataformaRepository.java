package br.com.tech4me.tech4plataforma.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.tech4plataforma.model.Plataforma;

public interface PlataformaRepository extends MongoRepository<Plataforma,String> {
    Plataforma findByDescricao(String descricao);
}
