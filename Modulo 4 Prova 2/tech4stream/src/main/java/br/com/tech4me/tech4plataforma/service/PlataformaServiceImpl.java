package br.com.tech4me.tech4plataforma.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.tech4plataforma.client.MidiaFeignClient;
import br.com.tech4me.tech4plataforma.dto.PlataformaDto;
import br.com.tech4me.tech4plataforma.dto.PlataformaModeloresponseComMidias;
import br.com.tech4me.tech4plataforma.model.Plataforma;
import br.com.tech4me.tech4plataforma.repository.PlataformaRepository;

@Service 
public class PlataformaServiceImpl implements PlataformaService {

    @Autowired
    private PlataformaRepository repository;

    @Autowired
    private MidiaFeignClient client;

    private ModelMapper mapper = new ModelMapper(); 

    @Override
    public List<PlataformaDto> obterTodasAsPlataformas() {
        List<Plataforma> plataforma = repository.findAll();
        return plataforma.stream()
                .map(p -> mapper.map(p, PlataformaDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PlataformaDto obterPorId(String id) {
        Optional<Plataforma> plataforma = repository.findById(id);
        if(plataforma.isPresent()){
            return mapper.map(plataforma, PlataformaDto.class);
        }
        return null;
    }

    @Override
    public PlataformaDto obterPorDescricao(String descricao) {
        Plataforma plataforma = repository.findByDescricao(descricao);
        if (plataforma == null) {
            return null;                
        }
        return mapper.map(plataforma, PlataformaDto.class);
    }

    @Override
    public PlataformaModeloresponseComMidias buscartodasMidiasPlataforma(String id) {
        Optional<Plataforma> plataforma = repository.findById(id);

        if (plataforma.isPresent()) {

            PlataformaModeloresponseComMidias pComMidias = mapper.map(plataforma.get(), PlataformaModeloresponseComMidias.class);
        pComMidias.setMidias(client.buscarTodasMidiasPlataforma(id));

        return pComMidias;
        }
        return null;
        
    }   

    @Override
    public PlataformaDto cadastrarPlataforma(PlataformaDto plataforma) {
        Plataforma plataformaSalva = mapper.map(plataforma, 
                                Plataforma.class);
        repository.save(plataformaSalva);
        return mapper.map(plataformaSalva, PlataformaDto.class);
    }

    @Override
    public void excluirPlataforma(String id) {
        repository.deleteById(id);            
    }

    @Override
    public PlataformaDto alterarPlataforma(String id, PlataformaDto plataforma) {
        Optional<Plataforma> plataformaBusca = repository.findById(id);
        
        if (plataformaBusca.isPresent()) {
            Plataforma plataformaSalvar = mapper
            .map(plataforma, Plataforma.class);
            plataformaSalvar.setId(id);
            repository.save(plataformaSalvar);
            return mapper.map(plataformaSalvar, PlataformaDto.class);
        }
        
        return null;
    }

  
}
