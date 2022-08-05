package br.com.tech4me.tech4plataforma.client;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient("midia-ms")
public interface MidiaFeignClient {
    
    @RequestMapping(method = RequestMethod.GET, value="/midia/plataforma/{id}")
    List<Midia> buscarTodasMidiasPlataforma(@PathVariable String id);
}

