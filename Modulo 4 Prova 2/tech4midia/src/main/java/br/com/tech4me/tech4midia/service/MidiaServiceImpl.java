package br.com.tech4me.tech4midia.service;
    
    import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.tech4midia.dto.MidiaDto;
import br.com.tech4me.tech4midia.model.Midia;
import br.com.tech4me.tech4midia.repository.MidiaRepository;

@Service 
public class MidiaServiceImpl implements MidiaService {

    @Autowired
    private MidiaRepository repository;

    private ModelMapper mapper = new ModelMapper(); 

    @Override
    public List<MidiaDto> obterTodasAsMidias() {
        List<Midia> midia = repository.findAll();
        return midia.stream()
                .map(p -> mapper.map(p, MidiaDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public MidiaDto obterPorId(String id) {
        Optional<Midia> midia = repository.findById(id);
        if(midia.isPresent()){
            return mapper.map(midia, MidiaDto.class);
        }
        return null;
    }

    @Override
    public MidiaDto obterPorDescricao(String descricao) {
        Midia midia = repository.findByDescricao(descricao);
        if (midia == null) {
            return null;                
        }
        return mapper.map(midia, MidiaDto.class);
    }
    @Override
    public List<MidiaDto> buscarTodasMidiasPlataforma(String idPlataforma) {
        List<Midia> midias = repository.findByIdPlataforma(idPlataforma);
        return midias.stream()
                .map(midia -> mapper.map(midia, MidiaDto.class))
                .collect(Collectors.toList());
        
    }   

    @Override
    public MidiaDto cadastrarMidia(MidiaDto midia) {
        Midia midiaSalva = mapper.map(midia, Midia.class);
        repository.save(midiaSalva);
        return mapper.map(midiaSalva, MidiaDto.class);
    }
    @Override
    public void excluirMidia(String id) {
        repository.deleteById(id);            
    }

    @Override
    public MidiaDto incluirMidia(MidiaDto midia) {
        
        Midia midiaSalva = repository
        .save(mapper.map(midia, Midia.class));

        return mapper
        .map(midiaSalva, MidiaDto.class);
    }

    @Override
    public MidiaDto alterarMidia(String id, MidiaDto midia) {
        Optional<Midia> midiaBusca = repository.findById(id);
        
        if (midiaBusca.isPresent()) {
            Midia midiaSalvar = mapper
            .map(midia, Midia.class);
            midiaSalvar.setId(id);
            repository.save(midiaSalvar);
            return mapper.map(midiaSalvar, MidiaDto.class);
        }
        
        return null;
    }

    @Override
    public void excluirTodos() {
        repository.deleteAll();        
    }

    
}

