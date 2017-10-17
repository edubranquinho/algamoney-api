package com.algamoney.api.resource;

import com.algamoney.api.model.Lancamento;
import com.algamoney.api.repository.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @GetMapping
    public ResponseEntity<List<Lancamento>> obterLancamentos() {
        List<Lancamento> lancamentos = lancamentoRepository.findAll();
        return ResponseEntity.ok(lancamentos);
    }

    @GetMapping(value = "/{codigo}")
    private ResponseEntity<Lancamento> obter(@PathVariable Long codigo) {
        final Lancamento lancamento = lancamentoRepository.findOne(codigo);
        return Objects.isNull(lancamento) ? ResponseEntity.notFound().build() : ResponseEntity.ok(lancamento);
    }

}
