package com.algamoney.api.resource;

import com.algamoney.api.model.Pessoa;
import com.algamoney.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import javax.xml.ws.Response;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping
    private ResponseEntity<Pessoa> criar(@Valid @RequestBody Pessoa pessoa) {
        final Pessoa pessoaCriada = pessoaRepository.save(pessoa);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}").buildAndExpand(pessoaCriada.getCodigo()).toUri();
        return ResponseEntity.created(uri).body(pessoaCriada);
    }

    @GetMapping
    private ResponseEntity<List<Pessoa>> listar() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        return ResponseEntity.ok().body(pessoas);
    }

    @GetMapping("/{codigo}")
    private ResponseEntity<Pessoa> obter(@PathVariable Long codigo){
        Pessoa pessoa = pessoaRepository.findOne(codigo);
        return pessoa != null ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{codigo}")
    private ResponseEntity deletar(@PathVariable Long codigo){
        pessoaRepository.delete(codigo);
        return ResponseEntity.noContent().build();
    }
}
